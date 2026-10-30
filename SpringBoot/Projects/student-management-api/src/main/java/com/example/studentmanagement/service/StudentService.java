package com.example.studentmanagement.service;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

/*
 * Contains the application's student-management rules.
 * Controllers call this service rather than accessing the repository directly.
 */
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Student not found with ID: " + studentId));
    }

    public Student addStudent(Student student) {
        student.setId(null); // Ignore any ID supplied in a POST request.
        return studentRepository.save(student);
    }

    public Student updateStudent(Long studentId, Student updatedStudent) {
        getStudentById(studentId); // Throws 404 if the student does not exist.
        updatedStudent.setId(studentId);
        return studentRepository.save(updatedStudent);
    }

    public void deleteStudent(Long studentId) {
        boolean deleted = studentRepository.deleteById(studentId);
        if (!deleted) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Student not found with ID: " + studentId);
        }
    }
}
