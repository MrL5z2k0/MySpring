package com.lzk.springframework.context;

import java.util.EventListener;

/**
 * @author kasuo
 * @date 2021/8/19 3:47 下午
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);

}
