package com.dubbo.provider.impl;

import org.springframework.stereotype.Service;

@Service("testService")
public class TestService implements com.dubbo.service.TestService {
    @Override
    public String hello(String str) {
        return str+"你好！";
    }
}
