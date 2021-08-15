package com.lzk.springframework.beans.factory.support;

import com.lzk.springframework.beans.factory.config.BeanDefinition;

/**
 * @author lzk
 * @create 2021-08-15 19:18
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
