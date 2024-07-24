package com.sparta.kd.springmvc;

import com.sparta.kd.springmvc.entities.User;
import com.sparta.kd.springmvc.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }


//    @Bean
//    CommandLineRunner runner(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//        return args -> {
//            userRepository.save(new User("admin", passwordEncoder.encode("password"), "ROLE_ADMIN"));
//            userRepository.save(new User("user", passwordEncoder.encode("password"), "ROLE_USER"));
//        };
//    }
}
