package com.lzk.springframework.beans.factory;

/**
 * 实现此接口，既能感知到所属的 ClassLoader
 * @author kasuo
 * @date 2021/8/19 10:54 上午
 */
public interface BeanClassLoaderAware extends Aware{

    void setBeanClassLoader(ClassLoader classLoader);

}
