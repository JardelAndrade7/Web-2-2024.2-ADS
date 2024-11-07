package com.ja.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ja.myproject.model.ModelPartida;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerPartida {
    
    @GetMapping("/")
    public ModelAndView create () {
        ModelAndView modelAndView = new ModelAndView();
        ModelPartida partida = new ModelPartida();
        String viewName = "partida/create";
        String partidaName = "partida";
        modelAndView.addObject(partidaName, partida);
        modelAndView.setViewName(viewName);
        return modelAndView;
    }

    @PostMapping("/partidaRead")
    public ModelAndView read (ModelPartida partida) {
        ModelAndView modelAndView = new ModelAndView();
        String viewName = "partida/read";
        String partidaName = "partida";
        modelAndView.addObject(partidaName, partida);
        modelAndView.setViewName(viewName);
        return modelAndView;
    }
}
