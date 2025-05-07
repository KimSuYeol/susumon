package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MinjinController {

    @GetMapping("/minjin")
    public @ResponseBody minjin() {
        return "Hello, Minjin";
    }

}
