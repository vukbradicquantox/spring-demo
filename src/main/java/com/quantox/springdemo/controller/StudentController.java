package com.quantox.springdemo.controller;

import com.quantox.springdemo.model.Student;
import com.quantox.springdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> testEndpoint() {
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    @PostMapping("/students")
    void saveStudent(@RequestBody Student student) {
        studentRepository.save(student);
    }

}
