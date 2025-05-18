package com.zhouzhou;

import com.zhouzhou.annotation.RpcService;
import lombok.extern.slf4j.Slf4j;

/**
 * @CreateTime 2025年05月10日 07:52:00
 */
@Slf4j
@RpcService(group = "test1", version = "version1")
public class DemoRpcServiceImpl implements DemoRpcService {

    @Override
    public String hello() {
        return "hello";
    }
}
