package com.lzk.springframework.beans.factory.support;

import com.lzk.springframework.BeansException;
import com.lzk.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author lzk
 * @create 2021-08-15 19:38
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
