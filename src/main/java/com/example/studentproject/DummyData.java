package com.example.studentproject;

import com.example.studentproject.domain.Student;
import com.example.studentproject.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyData implements CommandLineRunner {

    private final StudentRepository studentRepository;

    public DummyData(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        studentRepository.save(new Student( "Elinor","Kaguongo"));
        studentRepository.save(new Student("Stacy", "Bell"));
        studentRepository.save(new Student("Jake", "Micheals"));
    }
}