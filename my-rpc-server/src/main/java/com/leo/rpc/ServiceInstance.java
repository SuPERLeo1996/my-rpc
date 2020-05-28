package com.leo.rpc;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.Method;

/**
 * @ClassName ServiceInstance
 * @Description 表示一个具体的服务
 * @Author Leo
 * @Date 2020/4/12 9:58
 */
@Data
@AllArgsConstructor
public class ServiceInstance {
    private Object target;
    private Method method;
}
