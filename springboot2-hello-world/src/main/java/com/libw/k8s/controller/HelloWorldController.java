package com.libw.k8s.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wtx
 * @Date 2019/10/5
 */

@RequestMapping("/")
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String helloworld() {
        return "helloworld";
    }
}
