package com.sparta.kd.springjpa;

import com.sparta.kd.springjpa.entities.AuthorEntity;
import com.sparta.kd.springjpa.entities.BookEntity;
import com.sparta.kd.springjpa.repositories.AuthorRepository;
import com.sparta.kd.springjpa.repositories.BookRepository;
import com.sparta.kd.springjpa.services.LibraryService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Modifying;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class SpringJpaApplicationTests {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    AuthorRepository authorRepository;
    private LibraryService libraryService;

    @Test
    @DisplayName("Check that I can see all authors")
    @Transactional
    void checkThatICanSeeAllAuthors() {
        List<AuthorEntity> authors = new ArrayList<>(authorRepository.findAll());
        for (AuthorEntity author : authors) {
            System.out.println(author.toString());
        }
    }

    @Test
    @DisplayName("Check that SPEL does not override SQL Query")
    void checkThatSPELDoesNotOverrideSQLQuery() {
        Optional<AuthorEntity> author = authorRepository.findAuthorEntityByFullName(1);
        author.ifPresent(System.out::println);
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

    @Test
    @DisplayName("Check if update author where id = value updates correctly")
    void checkIfUpdateAuthorWhereIdUpdatesCorrectly() {
        authorRepository.updateAuthorName("Misty", 4);
        Optional<AuthorEntity> author = authorRepository.findAuthorEntityByFullName(4);
        author.ifPresent(System.out::println);
    }

    @Test
    @DisplayName("Check if return books when given author's name")
    void checkIfReturnBooksWhenGivenAuthorsName() {
        List<BookEntity> books = new ArrayList<>(bookRepository.findAllBooksByAuthorFullName("Manish"));
        for (BookEntity book : books) {
            System.out.println(book.toString());
        }
    }



    @Test
    @DisplayName("Check that get all authors who only have a single book returns correctly")
    void checkThatGetAllAuthorsWhoOnlyHasSingleBookReturnsCorrectly() {
        LibraryService libraryService = new LibraryService(authorRepository, bookRepository);
        List<AuthorEntity> authors = new ArrayList<>(libraryService.findAllAuthorsWhoHaveOnlyASingleBook());
        System.out.println(authors.toString());
    }
}
