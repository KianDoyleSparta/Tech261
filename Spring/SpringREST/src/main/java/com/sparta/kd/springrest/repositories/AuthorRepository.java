package com.sparta.kd.springrest.repositories;

import com.sparta.kd.springrest.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}