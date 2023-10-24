package com.quantox.springdemo.repository;

import com.quantox.springdemo.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentRepositoryTests {

    @Autowired
    StudentRepository repo;

    @Test
    public void getAllStudents_successCase() {
        List<Student> students = repo.findAll();
        Assertions.assertEquals(17, students.size());
    }

    @Test
    public void getAllStudents_failCase() {
        List<Student> students = repo.findAll();
        Assertions.assertNotEquals(10, students.size());
    }


}
