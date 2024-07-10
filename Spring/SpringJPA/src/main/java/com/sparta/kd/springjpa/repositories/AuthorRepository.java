package com.sparta.kd.springjpa.repositories;

import com.sparta.kd.springjpa.entities.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer> {

    List<AuthorEntity> findAllByFullName(String name);

}
