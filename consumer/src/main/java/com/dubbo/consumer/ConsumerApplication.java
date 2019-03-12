package com.dubbo.consumer;

import com.dubbo.common.LoadResource;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@LoadResource(scanBasePackages = "com.dubbo",
        resourceLocations = {"classpath:consumer.xml"})
public class ConsumerApplication {

    public static void main(String[] args) {
       SpringApplication springApplication = new SpringApplication(ConsumerApplication.class);
       springApplication.setBannerMode(Banner.Mode.OFF);
       springApplication.run(args);
    }

}
