package com.example.demo.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("message", "Hello world");
        return "hello";
    }
    @GetMapping("/error1")
    public String erroExpression(Model model){
        model.addAttribute("message1", "++++++++");
        return "error";
    }

}
