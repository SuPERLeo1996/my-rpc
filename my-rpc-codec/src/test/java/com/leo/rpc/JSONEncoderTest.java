package com.leo.rpc;

import org.junit.Test;

import static org.junit.Assert.*;

public class JSONEncoderTest {

    @Test
    public void encode() {
        Encoder encoder = new JSONEncoder();
        TestBean bean = new TestBean();
        bean.setAge(18);
        bean.setName("smgeek");

        byte[] bytes = encoder.encode(bean);

        assertNotNull(bytes);
    }
}