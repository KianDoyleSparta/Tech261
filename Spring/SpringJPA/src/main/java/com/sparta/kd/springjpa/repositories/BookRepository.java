package com.sparta.kd.springjpa.repositories;

import com.sparta.kd.springjpa.entities.AuthorEntity;
import com.sparta.kd.springjpa.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer> {

    List<BookEntity> findAllByTitle(String name);
    List<BookEntity> findAllByAuthor(Optional<AuthorEntity> authorEntity);

    @Query(value = "select b from BookEntity b join fetch b.author a where a.fullName like ?1")
    List<BookEntity> findAllBooksByAuthorFullName(String name);

}