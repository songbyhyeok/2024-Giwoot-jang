package com.giwootjang.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MyController {

    @ModelAttribute("commonData")
    public String populateCommonData() {
        return "This is common data";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
