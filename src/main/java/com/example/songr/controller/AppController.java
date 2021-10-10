package com.example.songr.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {



    @GetMapping("/hello")
    public String helloWorld(@RequestParam(name = "name", required = false, defaultValue = "World")
                                         String name, Model model){
        model.addAttribute("name", name);

        return "hello";

    }


    @GetMapping("/capitalize/{name}")
        public String capitalizing(@PathVariable("name") String name, Model model){
        name.toUpperCase();
        model.addAttribute("name", name.toUpperCase());
        return "capitalize";

        }


@GetMapping("/")
    public String welcomeroute(String name, Model model){
       model.addAttribute("Welcome", name);
       return "welcome";
}




}
