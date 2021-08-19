package com.lzk.springframework.context.event;

import com.lzk.springframework.context.ApplicationEvent;
import com.lzk.springframework.context.ApplicationListener;

/**
 * @author kasuo
 * @date 2021/8/19 3:45 下午
 */
public interface ApplicationEventMulticaster {

    /**
     * Add a listener to be notified of all events.
     * @param listener the listener to add
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * Remove a listener from the notification list.
     * @param listener the listener to remove
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * Multicast the given application event to appropriate listeners.
     * @param event the event to multicast
     */
    void multicastEvent(ApplicationEvent event);

}
