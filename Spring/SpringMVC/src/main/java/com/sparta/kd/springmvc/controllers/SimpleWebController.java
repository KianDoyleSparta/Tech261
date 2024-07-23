package com.sparta.kd.springmvc.controllers;

import com.sparta.kd.springmvc.entities.Author;
import com.sparta.kd.springmvc.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.time.LocalTime;

@Controller
public class SimpleWebController {

    @GetMapping
    public String welcome(Model model) {
        model.addAttribute("date", LocalDate.now());
        model.addAttribute("time", LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss")));
        return "welcome";
    }
}
