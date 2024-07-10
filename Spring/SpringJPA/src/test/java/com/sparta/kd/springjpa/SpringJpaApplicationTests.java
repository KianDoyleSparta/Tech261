package com.sparta.kd.springjpa;

import com.sparta.kd.springjpa.entities.AuthorEntity;
import com.sparta.kd.springjpa.entities.BookEntity;
import com.sparta.kd.springjpa.repositories.AuthorRepository;
import com.sparta.kd.springjpa.repositories.BookRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringJpaApplicationTests {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    AuthorRepository authorRepository;

    @Test
    @DisplayName("Check that I can see all authors")
    void checkThatICanSeeAllAuthors() {
        List<AuthorEntity> authors = new ArrayList<>(authorRepository.findAll());
        for (AuthorEntity author : authors) {
            System.out.println(author.toString());
        }
    }

    @Test
    @DisplayName("Check that I can find an author by their ID")
    void checkThatICanFindAnAuthorByTheirID() {
        System.out.println(authorRepository.findById(1));
    }

    @Test
    @DisplayName("Check that I can find authors by their names")
    void checkThatICanFindAuthorsByTheirNames() {
        List<AuthorEntity> authors = new ArrayList<>(authorRepository.findAllByFullName("Manish"));
        for (AuthorEntity author : authors) {
            System.out.println(author.toString());
        }
    }


    @Test
    @DisplayName("Check that I can see all books")
    void checkThatICanSeeAllBooks() {
        List<BookEntity> books = new ArrayList<>(bookRepository.findAll());
        for (BookEntity book : books) {
            System.out.println(book.toString());
        }
    }

    @Test
    @DisplayName("Check that I can find a book by its ID")
    void checkThatICanFindABookByItsID() {
        System.out.println(bookRepository.findById(1));
    }

    @Test
    @DisplayName("Check that I can find books by their names")
    void checkThatICanFindBooksByTheirNames() {
        List<BookEntity> books = new ArrayList<>(bookRepository.findAllByTitle("Java Training for Dummy Spartan Trainees"));
        for (BookEntity book : books) {
            System.out.println(book.toString());
        }
    }

    @Test
    @DisplayName("Check that I can find books by their authors")
    void checkThatICanFindBooksByTheirAuthors() {
        List<BookEntity> books = new ArrayList<>(bookRepository.findAllByAuthor(authorRepository.findById(1)));
        for (BookEntity book : books) {
            System.out.println(book.toString());
        }
    }

}
