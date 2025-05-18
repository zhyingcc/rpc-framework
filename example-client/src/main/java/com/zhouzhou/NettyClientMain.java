package com.zhouzhou
;

import com.zhouzhou
.annotation.RpcScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @CreateTime 2025年05月10日 07:25:00
 */
@RpcScan(basePackage = {"com.zhouzhou "})
public class NettyClientMain {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(NettyClientMain.class);
        HelloController helloController = (HelloController) applicationContext.getBean("helloController");
        helloController.test();
    }
}
