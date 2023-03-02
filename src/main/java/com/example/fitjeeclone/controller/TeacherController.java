package com.example.fitjeeclone.controller;

import com.example.fitjeeclone.dto.EnrollmentDto;
import com.example.fitjeeclone.dto.TeacherDto;
import com.example.fitjeeclone.mapper.EnrollmentMapper;
import com.example.fitjeeclone.mapper.TeacherMapper;
import com.example.fitjeeclone.model.Enrollment;
import com.example.fitjeeclone.model.Teacher;
import com.example.fitjeeclone.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/get-teacher/{teacherId}")
    public ResponseEntity<TeacherDto> getTeacher(@PathVariable Integer teacherId) {
        Teacher teacher = teacherService.getTeacher(teacherId);

        if(teacher == null) return ResponseEntity.notFound().build();

        TeacherDto teacherDto = TeacherMapper.INSTANCE.toDto(teacher);

        return ResponseEntity.ok(teacherDto);
    }
}
