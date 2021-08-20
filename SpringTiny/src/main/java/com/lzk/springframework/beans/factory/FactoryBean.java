package com.lzk.springframework.beans.factory;

/**
 * @author kasuo
 * @date 2021/8/19 2:26 下午
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean singleton();

}
