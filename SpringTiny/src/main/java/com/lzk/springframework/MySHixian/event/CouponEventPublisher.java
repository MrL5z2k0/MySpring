//package com.lzk.springframework.MySHixian.event;
//
//import com.lzk.springframework.beans.BeansException;
//import com.lzk.springframework.context.ApplicationContext;
//import com.lzk.springframework.context.ApplicationContextAware;
//import com.lzk.springframework.context.event.ApplicationEventPublisher;
//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;
//
///**
// * @author kasuo
// * @date 2021/8/27 3:51 下午
// */
//@Component
//public class CouponEventPublisher implements ApplicationEventPublisherAware, ApplicationContextAware {
//    /**
//     * 日志管理组件
//     */
//    private static final Logger LOGGER = LoggerFactory.getLogger(CouponEventPublisher.class);
//
//    /**
//     * 山下文容器
//     */
//    private ApplicationContext applicationContext;
//
//    /**
//     * 事件发布组件
//     */
//    private ApplicationEventPublisher applicationEventPublisher;
//
//    @Override
//    public void setApplicationContext(@NonNull ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = applicationContext;
//    }
//
//    @Override
//    public void setApplicationEventPublisher(@NonNull ApplicationEventPublisher applicationEventPublisher) {
//        this.applicationEventPublisher = applicationEventPublisher;
//    }
//
//    /**
//     * 广播{@link CouponEventPublisher}事件
//     *
//     * @param baseBank 消费者
//     */
//    public void publishEvent(BaseBank baseBank) {
//        LOGGER.info("消费者事件发布开始，参数:{}", JSON.toJSONString(baseBank));
//        CouponEvent event = new CouponEvent(applicationContext);
//        event.setBaseBank(baseBank);
//        applicationEventPublisher.publishEvent(event);
//        System.out.println("事件发布完成。。。。");
//        LOGGER.info("事件发布结束");
//        LOGGER.info("broadcast FirstLogonEvent");
//    }
//}
//
