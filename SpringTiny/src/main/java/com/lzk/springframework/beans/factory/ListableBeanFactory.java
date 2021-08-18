package com.lzk.springframework.beans.factory;

import com.lzk.springframework.beans.BeansException;

import java.util.Map;

/**
 * @author kasuo
 * @date 2021/8/18 3:00 下午
 */
public interface ListableBeanFactory extends BeanFactory{
    /**
     * 按照类型返回Bean实例
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();
}
