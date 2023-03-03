package com.example.fitjeeclone.service;

import com.example.fitjeeclone.model.SubjectAssignment;
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

    public Teacher addTeacher(Teacher teacher) {
        Teacher response = teacherRepository.save(teacher);

        return response;
    }

    public Teacher updateTeacherSalary(Integer teacherId, Teacher teacher) {
        Optional<Teacher> teacherResponse = teacherRepository.findById(teacherId);

        if(!teacherResponse.isPresent()) return null;

        teacherResponse.get().setSalary(teacher.getSalary());
        Teacher response = teacherRepository.save(teacherResponse.get());

        return response;
    }

    public void deleteTeacher(Integer teacherId) {
        teacherRepository.deleteById(teacherId);

        return;
    }
}
