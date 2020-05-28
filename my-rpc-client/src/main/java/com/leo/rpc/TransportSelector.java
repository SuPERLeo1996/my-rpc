package com.leo.rpc;

import java.util.List;

/**
 * @ClassName TransportSelector
 * @Description
 * @Author Leo
 * @Date 2020/4/13 21:51
 */
public interface TransportSelector {

    /**
     * 初始化selector
     * @param peers 可以连接的server端点信息
     * @param count client与server建立多少个链接
     * @param clazz client实现class
     */
    void init(List<Peer> peers,int count,Class<? extends TransportClient> clazz);

    /**
     * 选择一个transport与server做交互
     * @return
     */
    TransportClient select();

    /**
     * 释放用完的client
     * @param client
     */
    void release(TransportClient client);

    void close();

}
