package com.mycom.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Api(value = "a")
public class TestController {
    @GetMapping(value = "/hello")
    @ApiOperation(value = "a")
    public String sayHello(){
        return "hello world";
    }
}
