package com.sparta.kd.springjpa.repositories;

import com.sparta.kd.springjpa.entities.AuthorEntity;
import com.sparta.kd.springjpa.entities.BookEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer> {

    // Create
    @Modifying
    @Transactional
    @Query(value = "insert into library.authors VALUES (?1)", nativeQuery = true)
    void createNewAuthor(String name);

    @Modifying
    @Transactional
    @Query(value = "insert into library.authors values ?1", nativeQuery = true)
    void createMultipleNewAuthorsFromList(List<String> names);

    // Read
    @Query(value = "select * from library.authors where authors.full_name = ?1", nativeQuery = true)
    List<AuthorEntity> findAllByFullName(String name); // Returns Optional<AuthorEntity> OR a List<AuthorEntity>

    @Query(value = "select * from library.authors where authors.full_name like ?1", nativeQuery = true)
    List<AuthorEntity> findAllByFullNameLike(String name);

    @Query(value = "select * from library.authors where authors.author_id = ?1", nativeQuery = true)
    Optional<AuthorEntity> findAuthorEntityByFullName(int id);

    // Update
    @Modifying
    @Transactional
    @Query(value = "update authors set authors.full_name = ?1 where authors.author_id = ?2", nativeQuery = true)
    void updateAuthorName(String fullName, Integer id);

    //JPQL
//    @Query(value = "select a from AuthorEntity where a.full_name = ?", nativeQuery = false)

    // Spring's expression language: SPEL
    List<AuthorEntity> findAuthorEntitiesByFullNameIgnoreCase(String fullName);

}
