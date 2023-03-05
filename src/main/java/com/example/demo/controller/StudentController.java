package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService service)
    {
        this.studentService  = service;
    }

    @GetMapping("/hi")
    public List<Student> getStudents()
    {
        return studentService.getAllStudents();
    }
}
