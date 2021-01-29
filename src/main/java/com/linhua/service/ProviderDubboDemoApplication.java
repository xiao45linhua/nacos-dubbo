package com.linhua.service;

/**
 * @author linhua
 * @date 2021/1/22
 * @description
 */
//import com.linhua.service.facade.impl.ShutdownUnReigister;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@EnableDubbo(scanBasePackages = "com.linhua.service.facade")
@SpringBootApplication
public class ProviderDubboDemoApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(ProviderDubboDemoApplication.class, args);
        //Runtime.getRuntime().addShutdownHook(new ShutdownUnReigister());

    }
}