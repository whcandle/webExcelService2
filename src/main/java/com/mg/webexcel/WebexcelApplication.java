package com.mg.webexcel;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebexcelApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebexcelApplication.class, args);
        LoggerFactory.getLogger(WebexcelApplication.class).info("启动成功！");
    }

}
