package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

    @InjectMocks
    private StudentService studentService;

    @Mock
    private StudentRepository studentRepository;

    @Test
    void testStudentService()
    {
        List<Student> s = new ArrayList<>();
        Student s1 = new Student();
        s1.setName("hey");
        s1.setId(2);
        s1.setId(33);
        s.add(s1);
        when(studentRepository.findAll()).thenReturn(s);

        List<Student> s3=studentService.getAllStudents();



        assertEquals(s3.size(),s.size());
        assertEquals(s.get(0).getId(),s3.get(0).getId());

    }

    @Test
    void anotherTest()
    {
        String x = studentService.sayHi();
        assertEquals("yoyo",x);
    }
}
