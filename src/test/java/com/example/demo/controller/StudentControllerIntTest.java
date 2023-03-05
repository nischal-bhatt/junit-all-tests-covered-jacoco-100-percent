package com.example.demo.controller;

import com.example.demo.DemoApplication;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@WebMvcTest(StudentController.class)
public class StudentControllerIntTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentService studentService;

    @Test
    void testControllerInt() throws Exception {
        List<Student> students = new ArrayList<>();
        Student st = new Student();
        st.setId(3);
        st.setName("hey");
        students.add(st);

        when(studentService.getAllStudents()).thenReturn(students);
        mockMvc.perform(MockMvcRequestBuilders
                .get("/hi")
                ).andExpect(MockMvcResultMatchers.jsonPath("$[0]").exists());



    }

    @Test
    void testtest()
    {
        DemoApplication.main(new String[] {});
    }
}
