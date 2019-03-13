package com.dubbo.provider.impl;

import org.springframework.stereotype.Service;

@Service("checkService")
public class CheckService implements com.dubbo.service.CheckService {
    @Override
    public String checkTest(String str) {
        return str;
    }
}
