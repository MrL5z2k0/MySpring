package com.lzk.springframework.context.event;

import com.lzk.springframework.beans.factory.BeanFactory;
import com.lzk.springframework.context.ApplicationEvent;
import com.lzk.springframework.context.ApplicationListener;

/**
 * @author kasuo
 * @date 2021/8/19 4:24 下午
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }

}
