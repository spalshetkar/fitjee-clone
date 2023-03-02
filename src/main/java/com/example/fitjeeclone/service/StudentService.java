package com.example.fitjeeclone.service;

import com.example.fitjeeclone.model.Student;
import com.example.fitjeeclone.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student getStudent(Integer studentId) {
        return studentRepository.getReferenceById(studentId);
    }

    public Student addStudent(Student student) {
        Student response = studentRepository.save(student);

        return student;
    }


}
