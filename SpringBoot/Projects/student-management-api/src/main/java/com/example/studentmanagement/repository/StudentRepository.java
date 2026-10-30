package com.example.studentmanagement.repository;

import com.example.studentmanagement.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/*
 * Handles all student data storage operations.
 * A ConcurrentHashMap is used instead of a database, so data exists only
 * in application memory and is cleared when the application stops.
 */
@Repository
public class StudentRepository {
    private final ConcurrentMap<Long, Student> students = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(2);

    public StudentRepository() {
        students.put(1L, new Student(1L, "Rahul Sharma", "rahul@example.com", "Java"));
        students.put(2L, new Student(2L, "Priya Singh", "priya@example.com", "Spring Boot"));
    }

    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    }

    public Optional<Student> findById(Long id) {
        return Optional.ofNullable(students.get(id));
    }

    public Student save(Student student) {
        if (student.getId() == null) {
            student.setId(idGenerator.incrementAndGet());
        }
        students.put(student.getId(), student);
        return student;
    }

    public boolean deleteById(Long id) {
        return students.remove(id) != null;
    }
}
