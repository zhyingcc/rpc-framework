package com.zhouzhou
.serviceimpl;

import com.zhouzhou
.Hello;
import com.zhouzhou
.HelloService;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @CreateTime 2025年05月10日 07:52:00
 */
@Slf4j
public class HelloServiceImpl2 implements HelloService {

    static {
        System.out.println("HelloServiceImpl2被创建");
    }

    @Override
    public String hello(Hello hello) {
        log.info("HelloServiceImpl2收到: {}.", hello.getMessage());
        String result = "Hello description is " + hello.getDescription();
        log.info("HelloServiceImpl2返回: {}.", result);
        return result;
    }
}
