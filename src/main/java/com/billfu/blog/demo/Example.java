package com.billfu.blog.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class Example {
    @Value("${my.servers}")
    String value;
    @RequestMapping("/")
    String home(){
        System.out.println(value);
        return "hello world!aaa";

    }
}
