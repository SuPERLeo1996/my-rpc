package com.leo.rpc;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName Peer
 * @Description 表示网络传输的端点
 * @Author Leo
 * @Date 2020/4/11 14:56
 */
@Data
@AllArgsConstructor
public class Peer {
    private String host;
    private int port;
}
