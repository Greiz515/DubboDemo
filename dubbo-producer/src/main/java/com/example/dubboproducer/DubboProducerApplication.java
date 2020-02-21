package com.example.dubboproducer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableDubbo
public class DubboProducerApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(DubboProducerApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }

}
