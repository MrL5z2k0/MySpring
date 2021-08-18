package com.lzk.springframework.beans.factory.config;

/**
 * @author kasuo
 * @date 2021/8/18 10:37 上午
 *
 * Bean 的引用
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
