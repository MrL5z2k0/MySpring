package com.lzk.springframework.beans.factory.config;

import com.lzk.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @author kasuo
 * @date 2021/8/18 3:06 下午
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
