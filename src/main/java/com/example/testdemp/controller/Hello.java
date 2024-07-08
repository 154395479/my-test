package com.example.testdemp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: chl
 * @date: 2024/7/8 21:33
 */

@RestController
public class Hello {
    @RequestMapping("hello")
    public String hello() {
        return "你好啊";
    }

}
