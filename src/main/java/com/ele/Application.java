package com.ele;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.ele")
@MapperScan("com.ele.mappers")
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run =
                SpringApplication.run(Application.class,args);
    }
}
