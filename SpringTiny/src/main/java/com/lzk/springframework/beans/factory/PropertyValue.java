package com.lzk.springframework.beans.factory;

/**
 * @author kasuo
 * @date 2021/8/18 10:12 上午
 *
 * bean 属性信息
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
