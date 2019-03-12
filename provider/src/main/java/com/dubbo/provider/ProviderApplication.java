package com.dubbo.provider;

import com.dubbo.common.LoadResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@LoadResource(scanBasePackages = "com.dubbo",
        resourceLocations = {"classpath:provider.xml"})
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
