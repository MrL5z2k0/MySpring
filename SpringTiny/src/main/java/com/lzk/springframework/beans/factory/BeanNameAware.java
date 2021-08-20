package com.lzk.springframework.beans.factory;

/**
 * 实现此接口，既能感知到所属的 BeanName
 * @author kasuo
 * @date 2021/8/19 10:56 上午
 */
public interface BeanNameAware extends Aware {

    void setBeanName(String name);

}
