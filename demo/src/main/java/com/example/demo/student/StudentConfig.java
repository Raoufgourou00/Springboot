package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student s1 = new Student("Hind ASKEUR",
                    LocalDate.of(2001, Month.NOVEMBER, 13),
                    "hindaskeur@gmail.com");

            Student s2 = new Student("Raouf GOUROU",
                    LocalDate.of(2000, Month.JUNE, 22),
                    "raoufgourou00@gmail.com");

            studentRepository.saveAll(List.of(s1, s2));
        };
    }
}
