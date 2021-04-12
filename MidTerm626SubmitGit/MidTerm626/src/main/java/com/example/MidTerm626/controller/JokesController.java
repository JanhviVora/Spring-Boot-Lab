package com.example.MidTerm626.controller;
//Janhvi Vora
import com.example.MidTerm626.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    @RequestMapping("/joke")
    public String JokesController(@ModelAttribute("joke") Model model)
    {
        return "index";
    }
}
