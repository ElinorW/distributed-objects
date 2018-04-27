package com.example.studentproject.client;

import com.example.studentproject.domain.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "tester", url = "976c50d1.ngrok.io")
public interface StudentClient{
@RequestMapping(value = "/student", method = RequestMethod.GET)
List<Student> studentClient();

@RequestMapping(value = "students", method = RequestMethod.POST)
    Student createStudent(@RequestBody Student student);
}
