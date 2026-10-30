package com.example.studentmanagement.controller;

import com.example.studentmanagement.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/*
 * Handles DELETE /students/{studentId}.
 * A successful deletion returns HTTP 204 with no response body.
 */
@RestController
public class DeleteStudentController {
    private final StudentService studentService;

    public DeleteStudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @DeleteMapping("/students/{studentId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable Long studentId) {
        studentService.deleteStudent(studentId);
    }
}
