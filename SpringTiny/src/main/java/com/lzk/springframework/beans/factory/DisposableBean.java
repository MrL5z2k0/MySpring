package com.lzk.springframework.beans.factory;

/**
 * @author kasuo
 * @date 2021/8/18 6:11 下午
 */
public interface DisposableBean {

    void destroy() throws Exception;

}
