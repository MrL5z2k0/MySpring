package com.lzk.springframework.context;

import com.lzk.springframework.beans.BeansException;

/**
 * @author kasuo
 * @date 2021/8/18 3:58 下午
 */
public interface ConfigurableApplicationContext extends ApplicationContext{

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();
}
