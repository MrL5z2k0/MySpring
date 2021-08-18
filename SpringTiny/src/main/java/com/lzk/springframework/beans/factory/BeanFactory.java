package com.lzk.springframework.beans.factory;

import com.lzk.springframework.beans.BeansException;

/**
 * @author lzk
 * @create 2021-08-15 15:57
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
