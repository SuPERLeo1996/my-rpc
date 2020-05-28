package com.leo.rpc;

import com.alibaba.fastjson.JSON;

/**
 * @ClassName JSONDecoder
 * @Description 基于json的反序列化
 * @Author Leo
 * @Date 2020/4/11 15:21
 */
public class JSONDecoder implements Decoder {
    @Override
    public <T> T decode(byte[] bytes, Class<T> clazz) {
        return JSON.parseObject(bytes,clazz);
    }
}
