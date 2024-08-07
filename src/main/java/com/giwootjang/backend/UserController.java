package com.giwootjang.backend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/userForm")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "userForm";
    }

    @PostMapping("/submitForm")
    public String submitForm(User user, Model model) {
        // user 객체는 폼 데이터로부터 자동으로 바인딩됩니다.

        model.addAttribute("message", "User data submitted successfully!");
        return "result";
    }
}
