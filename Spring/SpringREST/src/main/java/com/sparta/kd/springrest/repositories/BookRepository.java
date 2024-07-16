package com.sparta.kd.springrest.repositories;

import com.sparta.kd.springrest.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}