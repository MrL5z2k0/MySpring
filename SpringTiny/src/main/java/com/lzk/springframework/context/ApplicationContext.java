package com.lzk.springframework.context;

import com.lzk.springframework.beans.factory.HierarchicalBeanFactory;
import com.lzk.springframework.beans.factory.ListableBeanFactory;
import com.lzk.springframework.context.event.ApplicationEventPublisher;
import com.lzk.springframework.core.io.ResourceLoader;

/**
 * 应用上下文
 * @author kasuo
 * @date 2021/8/18 3:56 下午
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
