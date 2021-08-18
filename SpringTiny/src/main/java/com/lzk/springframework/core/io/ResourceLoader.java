package com.lzk.springframework.core.io;

/**
 * @author kasuo
 * @date 2021/8/18 12:21 下午
 *
 * 定义获取资源接口，里面传递 location 地址即可。
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
