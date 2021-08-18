package com.lzk.springframework.beans.factory.xml;

import com.lzk.springframework.beans.BeansException;
import com.lzk.springframework.beans.PropertyValue;
import com.lzk.springframework.beans.factory.config.BeanDefinition;
import com.lzk.springframework.beans.factory.config.BeanReference;
import com.lzk.springframework.beans.factory.support.AbstractBeanDefinitionReader;
import com.lzk.springframework.beans.factory.support.BeanDefinitionRegistry;
import com.lzk.springframework.core.io.Resource;
import com.lzk.springframework.core.io.ResourceLoader;
import cn.hutool.core.util.XmlUtil;
import cn.hutool.core.util.StrUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author kasuo
 * @date 2021/8/18 2:12 下午
 *
 * 1、loadBeanDefinitions 方法，处理资源加载，这里新增加了一个内部方法：doLoadBeanDefinitions，它主要负责解析 xml
 * 2、在 doLoadBeanDefinitions 方法中，主要是对xml的读取 XmlUtil.readXML(inputStream) 和元素 Element 解析。
 * 在解析的过程中通过循环操作，以此获取 Bean 配置以及配置中的 id、name、class、value、ref 信息。
 * 3、最终把读取出来的配置信息，创建成 BeanDefinition 以及 PropertyValue，
 * 最终把完整的 Bean 定义内容注册到 Bean 容器：getRegistry().registerBeanDefinition(beanName, beanDefinition)
 */
public class XmlBeanDefinitionReader extends AbstractBeanDefinitionReader {
    public XmlBeanDefinitionReader(BeanDefinitionRegistry registry) {
        super(registry);
    }

    public XmlBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        super(registry, resourceLoader);
    }

    @Override
    public void loadBeanDefinitions(Resource resource) throws BeansException {
        try {
            try(InputStream inputStream = resource.getInputStream()){
                doLoadBeanDefinitions(inputStream);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void loadBeanDefinitions(Resource... resources) throws BeansException {
        for(Resource resource : resources){
            loadBeanDefinitions(resource);
        }
    }

    @Override
    public void loadBeanDefinitions(String location) throws BeansException {
        ResourceLoader resourceLoader = getResourceLoader();
        Resource resource = resourceLoader.getResource(location);
        loadBeanDefinitions(resource);
    }

    protected void doLoadBeanDefinitions(InputStream inputStream) throws ClassNotFoundException{
        Document doc = XmlUtil.readXML(inputStream);
        Element root = doc.getDocumentElement();
        NodeList childNodes = root.getChildNodes();

        for(int i = 0;i < childNodes.getLength();i++){
            // 判断元素
            if(!(childNodes.item(i) instanceof Element)) {
                continue;
            }
            // 判断对象
            if(!"bean".equals(childNodes.item(i).getNodeName())){
                continue;
            }

            // 解析标签
            Element bean = (Element)childNodes.item(i);
            String id = bean.getAttribute("id");
            String name = bean.getAttribute("name");
            String className = bean.getAttribute("class");
            // 获取Class，方便获取类中的名称
            Class<?> clazz = Class.forName(className);
            // 优先级id > name
            String beanName = StrUtil.isNotEmpty(id) ? id : name;
            if (StrUtil.isEmpty(beanName)) {
                beanName = StrUtil.lowerFirst(clazz.getSimpleName());
            }

            // 定义Bean
            BeanDefinition beanDefinition = new BeanDefinition(clazz);
            // 读取属性并填充
            for(int j = 0;j < bean.getChildNodes().getLength();j++){
                if(!(bean.getChildNodes().item(j) instanceof Element)){
                    continue;
                }
                if(!"property".equals(bean.getChildNodes().item(j).getNodeName())){
                    continue;
                }
                // 解析标签：property
                Element property = (Element) bean.getChildNodes().item(j);
                String attrName = property.getAttribute("name");
                String attrValue = property.getAttribute("value");
                String attrRef = property.getAttribute("ref");
                // 获取属性值：引入对象、值对象
                Object value = StrUtil.isNotEmpty(attrRef) ? new BeanReference(attrRef) : attrValue;
                // 创建属性信息
                PropertyValue propertyValue = new PropertyValue(attrName, value);
                beanDefinition.getPropertyValues().addPropertyValue(propertyValue);
            }
            if(getRegistry().containsBeanDefinition(beanName)){
                throw new BeansException("Duplication beanName[" + beanName + "] is not allowed");
            }
            // 注册BeanDefinition
            getRegistry().registerBeanDefinition(beanName, beanDefinition);
        }
    }
}