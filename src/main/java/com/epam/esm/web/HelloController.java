package com.epam.esm.web;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
    @GetMapping("/q")
    public String defaultPage(ModelMap model) {
        return "hello";
    }

    @GetMapping("/hello/{name:.+}")
    public ModelAndView hello(@PathVariable("name") String name) {

        ModelAndView model = new ModelAndView();
        model.setViewName("hello");
        model.addObject("message", name);

        return model;

    }

    @GetMapping("/getter")
    public String getString() {
        return "mod";
    }

    @PostMapping("/poster")
    public String postString() {
        return "postString";
    }
}
