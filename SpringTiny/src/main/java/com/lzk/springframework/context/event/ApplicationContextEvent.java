package com.lzk.springframework.context.event;

import com.lzk.springframework.context.ApplicationContext;
import com.lzk.springframework.context.ApplicationEvent;

/**
 * @author kasuo
 * @date 2021/8/19 3:37 下午
 */
public class ApplicationContextEvent extends ApplicationEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    /**
     * Get the <code>ApplicationContext</code> that the event was raised for.
     */
    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }

}
