package com.lzk.springframework.beans.factory;

import com.lzk.springframework.beans.BeansException;

/**
 * 实现此接口，既能感知到所属的 BeanFactory
 * @author kasuo
 * @date 2021/8/19 10:51 上午
 */
public interface BeanFactoryAware extends Aware{

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
