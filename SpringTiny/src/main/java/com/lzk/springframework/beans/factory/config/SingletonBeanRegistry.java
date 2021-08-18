package com.lzk.springframework.beans.factory.config;

/**
 * 单例注册表
 * @author lzk
 * @create 2021-08-15 16:26
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
