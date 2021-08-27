package com.lzk.springframework.MySHixian.event;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

/**
 * @author kasuo
 * @date 2021/8/27 3:51 下午
 */
//@Service
//public class CouponListener {
//    /**
//     * 日志管理组件
//     */
//    private static final Logger LOGGER = LoggerFactory.getLogger(CouponListener.class);
//
//    /**
//     * 优惠券service组件
//     */
//    @Autowired
//    private CouponService couponService;
//
//    /**
//     * 异步执行，async注解
//     * 登录事件监听器
//     */
//    @EventListener(CouponEvent.class)
//    @Async
//    public void dispatch(CouponEvent event) {
//        LOGGER.info("监听到发优惠券事件event:{}", event);
//        System.out.println("监听到发优惠券事件。。。");
//        BaseBank BaseBank = event.getBaseBank();
//        // 模拟异步场景
//        try {
//            System.out.println("发优惠券中。。。");
//            System.out.println(Thread.currentThread().getName());
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            LOGGER.info("线程等待",e);
//        }
//        // 更新优惠券到数据库里
//        System.out.println("数据库更新优惠券了");
//        System.out.println("发优惠券事件监听完成");
//        LOGGER.info("发优惠券事件监听完成");
//    }
//
//}
