package com.ja.myproject.controller;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ja.myproject.model.ModelPartida;
import com.ja.myproject.model.RepositoryPartida;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerPartida {

    @Autowired
    private RepositoryPartida repositoryPartida;
    
    @GetMapping("/")
    public String create () {
        String viewName = "partida/create";
        return viewName;
    }

    @PostMapping("/partidaRead")
    public ModelAndView read (ModelPartida modelPartida) {
        ModelAndView modelAndView = new ModelAndView();
        String viewName = "partida/read";
        String partidaName = "modelPartida";
        repositoryPartida.save(modelPartida);
        modelAndView.addObject(partidaName, modelPartida);
        modelAndView.setViewName(viewName);
        return modelAndView;
    }
}
