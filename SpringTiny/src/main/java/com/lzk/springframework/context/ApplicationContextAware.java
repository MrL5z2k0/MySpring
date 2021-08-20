package com.lzk.springframework.context;

import com.lzk.springframework.beans.BeansException;
import com.lzk.springframework.beans.factory.Aware;

/**
 * 实现此接口，既能感知到所属的 ApplicationContext
 * @author kasuo
 * @date 2021/8/19 10:57 上午
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
