package com.example.fitjeeclone.service;

import com.example.fitjeeclone.model.Student;
import com.example.fitjeeclone.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student getStudent(Integer studentId) {
        return studentRepository.getReferenceById(studentId);
    }

    public Student addStudent(Student student) {
        Student response = studentRepository.save(student);

        return response;
    }
    
    public Student updateStudentName(Integer studentId, Student student) {
        Optional<Student> studentResponse = studentRepository.findById(studentId);

        if(!studentResponse.isPresent()) return null;

        studentResponse.get().setStudentName(student.getStudentName());
        Student response = studentRepository.save(studentResponse.get());

        return response;
    }

    public void deletestudent(Integer studentId) {
        studentRepository.deleteById(studentId);
        
        return;
    }
}
