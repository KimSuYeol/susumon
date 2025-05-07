package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Susumon {

    @GetMapping("/susumon")
    public @ResponseBody String itcenstud() {
        return "Hello, itcenstud!!";
    }

    @GetMapping("/fire")
    public String fire() {
        return "views/fire";
    }
}
