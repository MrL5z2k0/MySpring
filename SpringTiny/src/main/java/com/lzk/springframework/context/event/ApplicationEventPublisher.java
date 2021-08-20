package com.lzk.springframework.context.event;

import com.lzk.springframework.context.ApplicationEvent;

/**
 * @author kasuo
 * @date 2021/8/19 4:06 下午
 */
public interface ApplicationEventPublisher {

    void publishEvent(ApplicationEvent event);

}
