package com.lzk.springframework.beans.factory.config;

import com.lzk.springframework.beans.BeansException;

/**
 * 用于修改新实例化 Bean 对象的扩展点
 * @author kasuo
 * @date 2021/8/18 3:53 下午
 */
public interface BeanPostProcessor {

    /**
     * 在 Bean 对象执行初始化方法之前，执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在 Bean 对象执行初始化方法之后，执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;

}
