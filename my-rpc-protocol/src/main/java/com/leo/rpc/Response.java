package com.leo.rpc;

import lombok.Data;

/**
 * @ClassName Response
 * @Description 表示RPC的返回
 * @Author Leo
 * @Date 2020/4/11 14:59
 */
@Data
public class Response {
    /**
     * 服务返回编码 0-成功，非0失败
     */
    private int code = 0;
    /**
     * 具体错误信息
     */
    private String message = "ok";
    /**
     * 返回的数据
     */
    private Object data;

}
