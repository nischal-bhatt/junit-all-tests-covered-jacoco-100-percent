package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public String sayHi() {

        return "yoyo";
    }

    public List<Student> getAllStudents() {

       List<Student> s = (List<Student>) this.studentRepository.findAll();

       return s;
    }
}
