package com.sparta.kd.springmvc.controllers;

import com.sparta.kd.springmvc.entities.Author;
import com.sparta.kd.springmvc.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorsController {

    private final AuthorRepository authorRepository;

    public AuthorsController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping("/authors")
    public String authors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors/authors";
    }

    @GetMapping("/authors/{id}")
    public String author(Model model, @PathVariable Integer id) {
        model.addAttribute("author", authorRepository.findById(id).get());
        return "authors/author";
    }

    @GetMapping("/authors/test")
    public String test(@RequestParam(required = false, defaultValue = "World") String message, Model model) {
        model.addAttribute("message", message);
        return "test";
    }

    @GetMapping("authors/create")
    public String createAuthor(Model model) {
        model.addAttribute("author", new Author());
        return "authors/create";
    }

    @PostMapping("authors/create")
    public String createAuthorPost(Author author) {
        authorRepository.save(author);
        return "redirect:/authors";
    }
}
