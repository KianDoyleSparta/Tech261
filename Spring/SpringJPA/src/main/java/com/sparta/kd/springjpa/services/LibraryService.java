package com.sparta.kd.springjpa.services;

import com.sparta.kd.springjpa.entities.AuthorEntity;
import com.sparta.kd.springjpa.entities.BookEntity;
import com.sparta.kd.springjpa.repositories.AuthorRepository;
import com.sparta.kd.springjpa.repositories.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class LibraryService {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    @Autowired
    public LibraryService(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Transactional
    public List<AuthorEntity> findAllAuthorsWhoHaveOnlyASingleBook() {
        List<AuthorEntity> authors = new ArrayList<>(authorRepository.findAll());
        List<AuthorEntity> authorsWhoHaveOnlyASingleBook = new ArrayList<>();
        for (AuthorEntity author : authors) {
            if (bookRepository.findAllBooksByAuthorFullName(author.getFullName()).size() == 1) {
                authorsWhoHaveOnlyASingleBook.add(author);
            }
        }

        return authorsWhoHaveOnlyASingleBook;
    }

}
