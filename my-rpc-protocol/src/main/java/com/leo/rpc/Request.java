package com.leo.rpc;

import lombok.Data;

/**
 * @ClassName Request
 * @Description 表示RPC的一个请求
 * @Author Leo
 * @Date 2020/4/11 14:58
 */
@Data
public class Request {
    private ServiceDescriptor serviceDescriptor;
    private Object[] parameters;
}
