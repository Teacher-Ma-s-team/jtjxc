package com.itqf.jtjxc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.itqf.jtjxc.mapper")
@SpringBootApplication
public class JtjxcApplication {

    public static void main(String[] args) {
        SpringApplication.run(JtjxcApplication.class, args);
    }

}
