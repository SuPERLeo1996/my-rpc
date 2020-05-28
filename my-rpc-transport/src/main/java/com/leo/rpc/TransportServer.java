package com.leo.rpc;

/**
 * @ClassName TransportServer
 * @Description
 * 1.启动、监听端口
 * 2.接受请求
 * 3.关闭监听
 * @Author Leo
 * @Date 2020/4/12 9:32
 */
public interface TransportServer {

    void init(int port,RequestHandler handler);

    void start();

    void stop();

}
