package com.dubbo.provider.impl;

import com.dubbo.service.TestSerivce;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestService implements TestSerivce {

    @Override
    public String hello(String str) {
        return "你好!"+str;
    }
}
