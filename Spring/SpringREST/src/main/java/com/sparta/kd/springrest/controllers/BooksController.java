package com.sparta.kd.springrest.controllers;

import com.sparta.kd.springrest.entities.Author;
import com.sparta.kd.springrest.entities.Book;
import com.sparta.kd.springrest.exceptions.ResourceNotFoundException;
import com.sparta.kd.springrest.repositories.AuthorRepository;
import com.sparta.kd.springrest.repositories.BookRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BooksController {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BooksController(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @GetMapping
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBook(@PathVariable Integer id) {
        if (!bookRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(bookRepository.findById(id).orElse(null));
        }
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody @Valid Book book, HttpServletRequest request) {
        if (book.getAuthor().getId() == null) {
            authorRepository.save(book.getAuthor());
        } else if (!authorRepository.existsById(book.getAuthor().getId())) {
            throw new ResourceNotFoundException("Author with id " + book.getAuthor().getId() + " not found");
        }
        bookRepository.save(book);
        URI location = URI.create(request.getRequestURL() + "/" + book.getId());
        return ResponseEntity.created(location).body(book);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Author> updateBook(@PathVariable Integer id, @RequestBody Book book) {
        if (!id.equals(book.getId())) {
            return ResponseEntity.badRequest().body(null);
        } else if (!bookRepository.existsById(id)) {
            throw new ResourceNotFoundException("Book with id " + book.getId() + " not found");
        } else if (!authorRepository.existsById(book.getAuthor().getId())) {
            throw new ResourceNotFoundException("Author with id " + book.getAuthor().getId() + " not found");
        } else {
            bookRepository.save(book);
            return ResponseEntity.ok(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Integer id) {
        if (!bookRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        } else {
            bookRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
    }
}
