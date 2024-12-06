package com.ja.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerInicio {

    @GetMapping
    public String redirectPartida () {
        String viewName = "redirect:/partida";
        return viewName;
    }
    
}
