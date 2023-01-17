package com.easybytes.restconsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.easybytes.restconsume.proxy")
public class RestconsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestconsumeApplication.class, args);
    }

}
