package com.Gaowtam.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageControllers {
    @RequestMapping("/nabela")
    public String home(Model model)
    {
        model.addAttribute("name", "Welcome To The Home Page");
        model.addAttribute("youtubeChannel", "Jmuna TV");
        model.addAttribute("githubRepo","https://github.com/Gaowtam");
        return "home";
    }
}
