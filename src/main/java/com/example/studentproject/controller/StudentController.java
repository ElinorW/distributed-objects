package com.example.studentproject.controller;

import com.example.studentproject.domain.Student;
import com.example.studentproject.repository.StudentRepository;
//import com.example.studentproject.service.StudentService;
import com.example.studentproject.service.StudentServiceImpl;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//tells that this is a controller class and blah blah
@RequestMapping(value = "/students")
public class StudentController {
    private final StudentRepository studentRepository;
    private final StudentServiceImpl studentService;

    public StudentController(StudentRepository studentRepository ,StudentServiceImpl studentService) {
        this.studentRepository = studentRepository;
        this.studentService = studentService;
    }
    //
    @GetMapping
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    //
    @GetMapping(value="{id}")
    public Student findById(@PathVariable Long id) // if your value and variable have a different name then specify @pathvariable(name="value_name"
    {
        return studentRepository.findById(id).get();
    }

    @PatchMapping
    public Student createStudent(@Validated(Student.Update.class) @RequestBody Student student){
        return studentService.createStudent(student);
    }

    @PostMapping
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping(value="{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }

    @GetMapping(value = "search")
    public List<Student>search(@RequestParam String searchTerm){
        return studentService.search(searchTerm);
    }


}
