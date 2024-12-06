package com.ja.myproject.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ja.myproject.model.ModelPartida;
import com.ja.myproject.model.RepositoryPartida;

import jakarta.transaction.Transactional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/partida")
public class ControllerPartida {

    @Autowired
    private RepositoryPartida repositoryPartida;

    @GetMapping
    public ModelAndView readAll (ModelAndView modelAndView) {
        List<ModelPartida> partidas = repositoryPartida.findAll();
        String viewName = "partida/readAll";
        String partidasName = "partidas";
        modelAndView.setViewName(viewName);
        modelAndView.addObject(partidasName, partidas);
        return modelAndView;
    }

    @GetMapping("/insertDados")
    public ModelAndView insertDados(Long id, ModelAndView modelAndView){
        String viewName = "partida/insertDados";
        if(id!= null){
            ModelPartida modelPartida = repositoryPartida.getReferenceById(id);
            String modelPartidaName = "modelPartida";
            modelAndView.addObject(modelPartidaName, modelPartida);
        }
        modelAndView.setViewName(viewName);
        return modelAndView;
    }

    @PostMapping("/insertDados")
    public String saveInsertDados (ModelPartida modelPartida) {
        String viewName = "redirect:/partida";
        repositoryPartida.save(modelPartida);
        return viewName;
    }

    @GetMapping("/readOne")
    public ModelAndView readOne (Long id, ModelAndView modelAndView) {
        ModelPartida modelPartida = repositoryPartida.getReferenceById(id);
        String viewName = "partida/readOne";
        String partidaName = "modelPartida";
        modelAndView.addObject(partidaName, modelPartida);
        modelAndView.setViewName(viewName);
        return modelAndView;
    }

    @PutMapping("/insertDados")
    @Transactional
    public String saveUpdateInsertDados (Long id, String localRealizacao, LocalDate dataRealizacao, LocalTime timeBegin, LocalTime timeEnd){
        ModelPartida modelPartida = repositoryPartida.getReferenceById(id);
        modelPartida.setLocalRealizacao(localRealizacao);
        modelPartida.setDataRealizacao(dataRealizacao);
        modelPartida.setTimeBegin(timeBegin);
        modelPartida.setTimeEnd(timeEnd);
        return "redirect:/partida";
    }

    @DeleteMapping
    public String delete (Long id){
        String viewName = "redirect:/partida";
        repositoryPartida.deleteById(id);
        return viewName;
    }
}
