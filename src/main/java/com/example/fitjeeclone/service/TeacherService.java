package com.example.fitjeeclone.service;

import com.example.fitjeeclone.model.Teacher;
import com.example.fitjeeclone.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher getTeacher(Integer teacherId) {
        Optional<Teacher> teacher = teacherRepository.findById(teacherId);

        return teacher.get();
    }
}
