import com.zhouzhou
.HelloService;
import com.zhouzhou
.config.RpcServiceConfig;
import com.zhouzhou
.remoting.transport.socket.SocketRpcServer;
import com.zhouzhou
.serviceimpl.HelloServiceImpl;

/**
 *
 * @CreateTime 2025年05月10日 07:25:00
 */
public class SocketServerMain {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        SocketRpcServer socketRpcServer = new SocketRpcServer();
        RpcServiceConfig rpcServiceConfig = new RpcServiceConfig();
        rpcServiceConfig.setService(helloService);
        socketRpcServer.registerService(rpcServiceConfig);
        socketRpcServer.start();
    }
}
