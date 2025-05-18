import com.zhouzhou
.HelloService;
import com.zhouzhou
.annotation.RpcScan;
import com.zhouzhou
.config.RpcServiceConfig;
import com.zhouzhou
.remoting.transport.netty.server.NettyRpcServer;
import com.zhouzhou
.serviceimpl.HelloServiceImpl2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Server: Automatic registration service via @RpcService annotation
 * @CreateTime 2025年05月10日 07:25:00
 */
@RpcScan(basePackage = {"com.zhouzhou"})
public class NettyServerMain {
    public static void main(String[] args) {
        // Register service via annotation
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(NettyServerMain.class);
        NettyRpcServer nettyRpcServer = (NettyRpcServer) applicationContext.getBean("nettyRpcServer");
        // Register service manually
        HelloService helloService2 = new HelloServiceImpl2();
        RpcServiceConfig rpcServiceConfig = RpcServiceConfig.builder()
                .group("test2").version("version2").service(helloService2).build();
        nettyRpcServer.registerService(rpcServiceConfig);
        nettyRpcServer.start();
    }
}
