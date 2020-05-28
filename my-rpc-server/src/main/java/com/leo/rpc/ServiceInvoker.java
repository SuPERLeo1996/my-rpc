package com.leo.rpc;

/**
 * @ClassName ServiceInvoker
 * @Description 调用具体服务
 * @Author Leo
 * @Date 2020/4/13 21:32
 */
public class ServiceInvoker {
    public Object invoke(ServiceInstance service,Request request) {
        return ReflectionUtils.invoke(service.getTarget(),service.getMethod(),request.getParameters());
    }
}
