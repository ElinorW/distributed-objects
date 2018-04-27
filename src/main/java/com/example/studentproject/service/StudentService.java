package com.example.studentproject.service;


import com.example.studentproject.domain.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);

    List<Student> findAllStudents();

    Student findById(Long id);

    void deleteStudent(Long id);

    Student updateStudent(Student student);

    List<Student> search(String searchTerm);
}
