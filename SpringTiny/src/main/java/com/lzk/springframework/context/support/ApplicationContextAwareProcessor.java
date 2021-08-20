package com.lzk.springframework.context.support;

import com.lzk.springframework.beans.BeansException;
import com.lzk.springframework.beans.factory.config.BeanPostProcessor;
import com.lzk.springframework.context.ApplicationContext;
import com.lzk.springframework.context.ApplicationContextAware;

/**
 * @author kasuo
 * @date 2021/8/19 10:59 上午
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
