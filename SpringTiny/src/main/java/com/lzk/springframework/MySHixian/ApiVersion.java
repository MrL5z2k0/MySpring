package com.lzk.springframework.MySHixian;

import java.lang.annotation.*;

/**
 * @author kasuo
 * @date 2021/8/27 3:44 下午
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiVersion {

    String value() default "1.0";
}
