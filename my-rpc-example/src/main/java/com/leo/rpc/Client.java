package com.leo.rpc;

/**
 * @ClassName client
 * @Description
 * @Author Leo
 * @Date 2020/4/13 22:23
 */
public class Client {

    public static void main(String[] args) {
        RpcClient client = new RpcClient();
        CalcService calcService = client.getProxy(CalcService.class);
        int r1 = calcService.add(1,2);
        int r2 = calcService.minus(10,8);

        System.out.println(r1);
        System.out.println(r2);
    }

}
