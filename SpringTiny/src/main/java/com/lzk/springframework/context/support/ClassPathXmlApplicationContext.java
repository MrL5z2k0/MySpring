package com.lzk.springframework.context.support;

import com.lzk.springframework.beans.BeansException;

/**
 * XML 文件应用上下文
 * @author kasuo
 * @date 2021/8/18 5:14 下午
 * 1、ClassPathXmlApplicationContext，是具体对外给用户提供的应用上下文方法。
 * 2、在继承了 AbstractXmlApplicationContext 以及层层抽象类的功能分离实现后，在此类 ClassPathXmlApplicationContext 的实现中就简单多了，主要是对继承抽象类中方法的调用和提供了配置文件地址信息。
 */
public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext{

    private String[] configLocations;

    public ClassPathXmlApplicationContext() {
    }

    /**
     * 从 XML 中加载 BeanDefinition，并刷新上下文
     *
     * @param configLocations
     * @throws BeansException
     */
    public ClassPathXmlApplicationContext(String configLocations) throws BeansException {
        this(new String[]{configLocations});
    }

    /**
     * 从 XML 中加载 BeanDefinition，并刷新上下文
     * @param configLocations
     * @throws BeansException
     */
    public ClassPathXmlApplicationContext(String[] configLocations) throws BeansException{
        this.configLocations = configLocations;
        refresh();
    }

    @Override
    protected String[] getConfigLocations() {
        return configLocations;
    }
}
