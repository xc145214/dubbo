package com.alibaba.dubbo.rpc.performance;

/**
 * @author: xiac
 * @date: 2018/6/8
 * @desc: 一句话描述
 */
public class CountServiceImpl implements CountService {

    private int count = 0;

    @Override
    public int count() {
        return count ++;
    }
}
