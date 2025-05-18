package com.zhouzhou.loadbalance;

import com.zhouzhou
.extension.SPI;
import com.zhouzhou.remoting.dto.RpcRequest;

import java.util.List;

/**
 * Interface to the load balancing policy

 */
@SPI
public interface LoadBalance {
    /**
     * Choose one from the list of existing service addresses list
     *
     * @param serviceUrlList Service address list
     * @param rpcRequest
     * @return target service address
     */
    String selectServiceAddress(List<String> serviceUrlList, RpcRequest rpcRequest);
}
