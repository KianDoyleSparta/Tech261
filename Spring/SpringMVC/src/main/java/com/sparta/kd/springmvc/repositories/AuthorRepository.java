package com.sparta.kd.springmvc.repositories;

import com.sparta.kd.springmvc.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}