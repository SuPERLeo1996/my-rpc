package com.leo.rpc;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName RpcClientConfig
 * @Description
 * @Author Leo
 * @Date 2020/4/13 22:04
 */
@Data
public class RpcClientConfig {
    private Class<? extends TransportClient> transportClass = HTTPTransportClient.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private Class<? extends TransportSelector> selectorClass = RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(new Peer("127.0.0.1",3000));
}
