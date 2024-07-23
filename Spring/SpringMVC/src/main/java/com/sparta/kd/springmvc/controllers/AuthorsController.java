package com.sparta.kd.springmvc.controllers;

import com.sparta.kd.springmvc.entities.Author;
import com.sparta.kd.springmvc.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AuthorsController {

    private final AuthorRepository authorRepository;

    public AuthorsController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping("/authors")
    public String authors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors";
    }

    @GetMapping("/authors/{id}")
    public String author(Model model, @PathVariable Integer id) {
        model.addAttribute("author", authorRepository.findById(id).get());
        return "author";
    }
}
