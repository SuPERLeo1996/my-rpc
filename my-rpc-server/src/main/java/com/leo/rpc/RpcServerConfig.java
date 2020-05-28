package com.leo.rpc;

import lombok.Data;

/**
 * @ClassName RpcServerConfig
 * @Description server配置
 * @Author Leo
 * @Date 2020/4/12 9:53
 */
@Data
public class RpcServerConfig {

    private Class<? extends TransportServer> transportClass = HTTPTransportServer.class;
    private Class<? extends  Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private int port = 3000;

}
