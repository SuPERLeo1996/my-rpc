package com.leo.rpc;

/**
 * @ClassName Decoder
 * @Description 反序列化
 * @Author Leo
 * @Date 2020/4/11 15:18
 */
public interface Decoder {

    <T> T decode(byte[] bytes,Class<T> clazz);

}
