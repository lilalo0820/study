package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("test")     // note# localhost:8080/test
    public String hello(Model model) {
        model.addAttribute("data","hello from controller"); // note# model
        return "hello";                                                             // note# page : hello.html
    }
}
