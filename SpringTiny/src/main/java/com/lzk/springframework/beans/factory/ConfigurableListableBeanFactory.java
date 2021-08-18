package com.lzk.springframework.beans.factory;

import com.lzk.springframework.beans.BeansException;
import com.lzk.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.lzk.springframework.beans.factory.config.BeanDefinition;
import com.lzk.springframework.beans.factory.config.BeanPostProcessor;
import com.lzk.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author kasuo
 * @date 2021/8/18 3:04 下午
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    @Override
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
