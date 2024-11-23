package com.example.sis.controller;

import com.example.sis.entity.Student;
import com.example.sis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public String listStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "students";
    }

    @GetMapping("/add")
    public String addStudentForm() {
        return "add-student";
    }

    @PostMapping
    public String addStudent(Student student) {
        studentService.addStudent(student);
        return "redirect:/students";
    }
}
