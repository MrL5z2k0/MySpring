package com.lzk.springframework;

/**
 * @author lzk
 * @create 2021-08-15 18:57
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
