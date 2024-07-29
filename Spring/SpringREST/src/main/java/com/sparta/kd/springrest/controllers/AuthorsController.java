package com.sparta.kd.springrest.controllers;

import com.sparta.kd.springrest.entities.Author;
import com.sparta.kd.springrest.repositories.AuthorRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

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

    @GetMapping("/hateoas/authors/{id}")
    public ResponseEntity<EntityModel<Author>> getAuthorHateoas(@PathVariable Integer id) {
        EntityModel<Author> authorEntityModel = authorRepository.findById(id)
                .map(
                        author ->
                        {
                            List<Link> bookLinks =
                                    author.getBooks()
                                            .stream()
                                            .map(book -> WebMvcLinkBuilder.linkTo(
                                                    methodOn(BooksController.class).getBook(book.getId())).withRel(book.getTitle()))
                                            .collect(Collectors.toList());
                            Link selfLink = WebMvcLinkBuilder.linkTo(
                                    methodOn(AuthorsController.class).getAuthor(author.getId())).withSelfRel();
                            Link relLink = WebMvcLinkBuilder.linkTo(methodOn(AuthorsController.class).getAuthors()).withRel("author");
                            return EntityModel.of(author, selfLink, relLink).add(bookLinks);
                            }).orElse(null);

        return ResponseEntity.ok(authorEntityModel);
    }

    @GetMapping("/hateoas/authors")
    public CollectionModel<EntityModel<Author>> getAuthorsHateoas() {
        List<EntityModel<Author>> authors = authorRepository.findAll()
                .stream()
                .map(
                        author ->
                        {
                            List<Link> bookLinks =
                                    author.getBooks()
                                            .stream()
                                            .map(
                                                    book -> WebMvcLinkBuilder.linkTo(
                                                            methodOn(BooksController.class).getBook(book.getId())).withRel(book.getTitle()))
                                            .collect( Collectors.toList());
                            Link selfLink = WebMvcLinkBuilder.linkTo(
                                    methodOn(AuthorsController.class).getAuthor(author.getId())).withSelfRel();
                            Link relLink = WebMvcLinkBuilder.linkTo(methodOn(AuthorsController.class).getAuthors()).withRel("author");
                            return EntityModel.of(author, selfLink, relLink).add(bookLinks);
                        })
                .collect(Collectors.toList());
        return CollectionModel.of(
                authors,
                WebMvcLinkBuilder.linkTo(methodOn(AuthorsController.class).getAuthorsHateoas()).withSelfRel());
    }

    @PostMapping
    public ResponseEntity<Author> createAuthor(@RequestBody @Valid Author author, HttpServletRequest request) {
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
