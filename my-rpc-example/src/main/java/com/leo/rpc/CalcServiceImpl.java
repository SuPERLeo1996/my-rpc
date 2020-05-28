package com.leo.rpc;

/**
 * @ClassName CalcServiceImpl
 * @Description
 * @Author Leo
 * @Date 2020/4/13 22:25
 */
public class CalcServiceImpl implements CalcService {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }
}
