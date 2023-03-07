package com.lucfzy.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDocker {

    @GetMapping("/helloDocker")
    public String helloDocker() {
        return "Hello Docker !!!";
    }

    @GetMapping("/helloSpring")
    public String helloSpring() {
        return "Hello Spring !!!";
    }

}
