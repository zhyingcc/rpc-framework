package com.zhouzhou.remoting.transport;

import com.zhouzhou.extension.SPI;
import com.zhouzhou.remoting.dto.RpcRequest;

/**
 * send RpcRequest。
 *
 *
 * @CreateTime 2025年05月29日 13:26:00
 */
@SPI
public interface RpcRequestTransport {
    /**
     * send rpc request to server and get result
     *
     * @param rpcRequest message body
     * @return data from server
     */
    Object sendRpcRequest(RpcRequest rpcRequest);
}
