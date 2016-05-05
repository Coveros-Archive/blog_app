package com.coveros.blogapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/")
public class HomeController {
 
    @RequestMapping(method = RequestMethod.GET)
    public String getRootPage(ModelMap model) {
        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
        return "index";
    }
 
    @RequestMapping(value = "/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
        return "welcome";
    }
 
}