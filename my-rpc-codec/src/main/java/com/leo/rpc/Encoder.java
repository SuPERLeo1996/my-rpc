package com.leo.rpc;

/**
 * @ClassName Encoder
 * @Description 序列化
 * @Author Leo
 * @Date 2020/4/11 15:18
 */
public interface Encoder {
    byte[] encode(Object obj);

}
