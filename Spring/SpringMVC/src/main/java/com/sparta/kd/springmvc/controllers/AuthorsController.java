package com.sparta.kd.springmvc.controllers;

import com.sparta.kd.springmvc.entities.Author;
import com.sparta.kd.springmvc.repositories.AuthorRepository;
import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthorsController {

    private final AuthorRepository authorRepository;

    public AuthorsController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping("/authors")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String authors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors/authors";
    }

    @GetMapping("/authors/{id}")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String author(Model model, @PathVariable Integer id) {
        model.addAttribute("author", authorRepository.findById(id).get());
        return "authors/author";
    }

//    @GetMapping("/authors/test")
//    public String test(@RequestParam(required = false, defaultValue = "World") String message, Model model) {
//        model.addAttribute("message", message);
//        return "test";
//    }

    @GetMapping("authors/create")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String createAuthor(Model model) {
        model.addAttribute("author", new Author());
        return "authors/create";
    }

    @PostMapping("authors/create")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String createAuthorPost(@Valid @ModelAttribute("author") Author author, Errors errors) {
        if (errors.hasErrors()) {
            return "authors/create";
        }
        authorRepository.save(author);
        return "redirect:/authors";
    }
}
