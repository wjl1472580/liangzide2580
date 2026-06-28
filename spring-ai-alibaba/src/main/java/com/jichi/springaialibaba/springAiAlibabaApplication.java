package com.jichi.springaialibaba;

// 1. 必须导入这个类
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 2. 必须加上这个注解，告诉Spring这是一个启动类
@SpringBootApplication
public class springAiAlibabaApplication {

    public static void main(String[] args) {
        // 3. 使用 SpringApplication.run 来启动，而不是直接用类名.run
        SpringApplication.run(springAiAlibabaApplication.class, args);
    }
}