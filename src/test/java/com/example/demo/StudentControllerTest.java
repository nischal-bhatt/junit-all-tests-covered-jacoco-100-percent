package com.example.demo;

import com.example.demo.controller.StudentController;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StudentControllerTest {

    @InjectMocks
    private StudentController studentController;

    @Mock
    private StudentService studentService;



    @Test
    void testGetStudents()
    {
        List<Student> students = new ArrayList<>();
        Student st = new Student();
        st.setId(3);
        st.setName("hey");
        students.add(st);

        when(studentService.getAllStudents()).thenReturn(students);

        List<Student> students1 = studentController.getStudents();
        boolean test = students1.get(0).getName().equals(students.get(0).getName());

        assertEquals("hey",students1.get(0).getName());
    }

    @Test
    void tete()
    {
        String r  =studentController.hihi();
        assertEquals("hehe",r);
    }

}
