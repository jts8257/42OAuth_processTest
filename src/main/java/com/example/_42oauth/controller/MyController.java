package com.example._42oauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/")
    public String now() {
        return "Receiver";
    }

    @RequestMapping("/location")
    public String nw() {
        return "location";
    }

    @GetMapping("/main")
    public String nn() {
        return "main";
    }
}

