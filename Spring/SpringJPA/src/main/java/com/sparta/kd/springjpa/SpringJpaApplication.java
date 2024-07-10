package com.sparta.kd.springjpa;

import com.sparta.kd.springjpa.entities.AuthorEntity;
import com.sparta.kd.springjpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringJpaApplication {

    private static final Logger logger = Logger.getLogger(SpringJpaApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(AuthorRepository authorRepository) {
        return args -> {
            logger.info("Hello from the CommandLineRunner");
            logger.warning("Here is another hello!");
//            logger.info(authorRepository.findAll().toString());
//            logger.info(authorRepository.findById(1).get().toString());
//            logger.info(authorRepository.findById(1).orElseThrow().toString());
//
//            AuthorEntity newAuthor = new AuthorEntity();
//            newAuthor.setFullName("Sandy");
//            authorRepository.save(newAuthor);
//
//            logger.info(authorRepository.findAll().toString());
//
//            authorRepository.delete(newAuthor);
//
//            logger.info(authorRepository.findAll().toString());

        };
    }
}
