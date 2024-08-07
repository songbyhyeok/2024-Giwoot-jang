package com.giwootjang.backend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FeedbackController {

    @RequestMapping("/formPage")
    public String showForm() {
        return "formPage"; // formPage.html을 렌더링
    }

    @PostMapping("/formPage")
    public String submitFeedback(@RequestParam String username,
                                 @RequestParam String feedback,
                                 Model model) {
        // 간단히 폼 데이터를 처리하고, 메시지를 생성합니다.
        System.out.println("sdasdasd");
        model.addAttribute("message", "Thank you, " + username + "! Your feedback has been received.");
        return "formPage"; // 동일한 formPage.html로 다시 이동
    }
}
