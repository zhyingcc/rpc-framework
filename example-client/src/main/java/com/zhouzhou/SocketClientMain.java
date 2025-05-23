package com.zhouzhou
;

import com.zhouzhou
.config.RpcServiceConfig;
import com.zhouzhou
.proxy.RpcClientProxy;
import com.zhouzhou
.remoting.transport.RpcRequestTransport;
import com.zhouzhou
.remoting.transport.socket.SocketRpcClient;

/**
 *
 * @CreateTime 2025年05月10日 07:25:00
 */
public class SocketClientMain {
    public static void main(String[] args) {
        RpcRequestTransport rpcRequestTransport = new SocketRpcClient();
        RpcServiceConfig rpcServiceConfig = new RpcServiceConfig();
        RpcClientProxy rpcClientProxy = new RpcClientProxy(rpcRequestTransport, rpcServiceConfig);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        String hello = helloService.hello(new Hello("111", "222"));
        System.out.println(hello);
    }
}
