package com.leo.rpc;

import java.io.InputStream;

/**
 * @ClassName TransportClient
 * @Description
 * 1.创建连接
 * 2.发送数据，并且等待响应
 * 3.关闭连接
 * @Author Leo
 * @Date 2020/4/12 9:30
 */
public interface TransportClient {

    void connect(Peer peer);

    InputStream write(InputStream data);

    void close();

}
