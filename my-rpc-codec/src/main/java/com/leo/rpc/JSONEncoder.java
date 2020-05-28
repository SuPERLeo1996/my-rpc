package com.leo.rpc;

import com.alibaba.fastjson.JSON;

/**
 * @ClassName JSONEncoder
 * @Description 基于json的序列化实现
 * @Author Leo
 * @Date 2020/4/11 15:20
 */
public class JSONEncoder implements Encoder{

    @Override
    public byte[] encode(Object obj) {
        return JSON.toJSONBytes(obj);
    }
}
