package com.lzk.springframework.context.support;

import com.lzk.springframework.beans.BeansException;
import com.lzk.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.lzk.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author kasuo
 * @date 2021/8/18 4:45 下午
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext{

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    private DefaultListableBeanFactory createBeanFactory(){
        return new DefaultListableBeanFactory();
    }

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
