package com.leo.rpc;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * @ClassName RequestHandler
 * @Description 处理网络请求的handler
 * @Author Leo
 * @Date 2020/4/12 9:34
 */
public interface RequestHandler {

    void onRequest(InputStream receive, OutputStream toResp);

}
