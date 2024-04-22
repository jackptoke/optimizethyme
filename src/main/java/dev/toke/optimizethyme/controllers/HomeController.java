package dev.toke.optimizethyme.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@Slf4j
@RequestMapping("/")
public class HomeController {
    public String homeController(Model model) {
        model.addAttribute("theDate", LocalDateTime.now());
        return "index";
    }
}
