package com.example.studentmanagement.controller;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*
 * Handles PUT /students/{studentId}.
 * It reads the ID from the URL and the replacement student data from JSON.
 */
@RestController
public class UpdateStudentController {
    private final StudentService studentService;

    public UpdateStudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PutMapping("/students/{studentId}")
    public Student updateStudent(@PathVariable Long studentId,
                                 @Valid @RequestBody Student student) {
        return studentService.updateStudent(studentId, student);
    }
}
