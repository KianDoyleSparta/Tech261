package com.sparta.kd.springrest.controllers;

import com.sparta.kd.springrest.entities.Author;
import com.sparta.kd.springrest.repositories.AuthorRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/authors")
public class AuthorsController {

    @Autowired
    private final AuthorRepository authorRepository;

    public AuthorsController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Author> getAuthor(@PathVariable Integer id) {
        Author author = authorRepository.findById(id).orElse(null);
        if (author == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(author, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Author> createAuthor(@RequestBody Author author, HttpServletRequest request) {
        authorRepository.save(author);

        URI location = URI.create(request.getRequestURL().toString() + "/" + author.getId());
        return ResponseEntity.created(location).body(author);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Author> updateAuthor(@PathVariable Integer id, @RequestBody Author author) {
        if (!id.equals(author.getId())) {
            return ResponseEntity.badRequest().body(null);
        } else if (!authorRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        } else {
            authorRepository.save(author);
            return ResponseEntity.ok(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Author> deleteAuthor(@PathVariable Integer id) {
        if(!authorRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        } else {
            authorRepository.deleteById(id);
            return ResponseEntity.ok(null);
        }
    }
}
