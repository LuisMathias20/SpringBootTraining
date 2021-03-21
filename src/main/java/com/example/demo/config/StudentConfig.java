package com.example.demo.config;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student maria = new Student(
                    "Maria",
                    "maria@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,01)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2001, Month.JANUARY,01)
            );

            repository.saveAll(List.of(maria, alex));
        };
    }
}
