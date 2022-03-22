package com.mofino.springboot.mofino.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView index(ModelAndView modelAndView, HttpSession session){

        if (session.getAttribute("username") != null){
            modelAndView.setViewName("redirect:/home");
        }else {
            modelAndView.setViewName("index.html");
        }
        return modelAndView;
    }

    @GetMapping ("/home")
    public ModelAndView home(ModelAndView modelAndView, HttpSession session){

        if (session.getAttribute("username") == null){
            modelAndView.setViewName("redirect:/login.html");
        }else {
            modelAndView.setViewName("home.html");
        }
        return modelAndView;
    }
}
