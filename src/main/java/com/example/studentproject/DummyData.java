package com.example.studentproject;

import com.example.studentproject.client.StudentClient;
import com.example.studentproject.domain.Student;
import com.example.studentproject.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyData implements CommandLineRunner {

    private final StudentRepository studentRepository;
    private final StudentClient studentClient;

    public DummyData(StudentRepository studentRepository, StudentClient studentClient) {
        this.studentRepository = studentRepository;
        this.studentClient = studentClient;
    }

    @Override
    public void run(String... args) throws Exception {
        studentRepository.save(new Student( "Elinor","Kaguongo"));
        studentRepository.save(new Student("Stacy", "Bell"));
        studentRepository.save(new Student("Jake", "Micheals"));


        studentClient.createStudent(new Student("Eli","Nor"));
        studentClient.studentClient();
    }
}