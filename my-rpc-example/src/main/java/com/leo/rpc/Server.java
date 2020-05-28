package com.leo.rpc;

/**
 * @ClassName Server
 * @Description
 * @Author Leo
 * @Date 2020/4/13 22:24
 */
public class Server {

    public static void main(String[] args) {
        RpcServer server = new RpcServer();
        server.register(CalcService.class,new CalcServiceImpl());
        server.start();
    }
}
