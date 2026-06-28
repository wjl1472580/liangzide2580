package com.jichi.springai;

// 1. 必须导入这个类
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 2. 必须加上这个注解，告诉Spring这是一个启动类
@SpringBootApplication
public class springaiApplication {

    public static void main(String[] args) {
        // 3. 使用 SpringApplication.run 来启动，而不是直接用类名.run
        SpringApplication.run(springaiApplication.class, args);
    }
}