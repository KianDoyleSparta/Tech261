package com.sparta.kd.springmvc.repositories;

import com.sparta.kd.springmvc.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}