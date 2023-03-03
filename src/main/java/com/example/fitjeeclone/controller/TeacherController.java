package com.example.fitjeeclone.controller;

import com.example.fitjeeclone.dto.TeacherDto;
import com.example.fitjeeclone.mapper.TeacherMapper;
import com.example.fitjeeclone.model.Teacher;
import com.example.fitjeeclone.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/get-teacher/{teacherId}")
    public ResponseEntity<TeacherDto> getTeacher(@PathVariable Integer teacherId) {
        Teacher teacher = teacherService.getTeacher(teacherId);

        if(teacher == null) return ResponseEntity.notFound().build();

        TeacherDto TeacherDto = TeacherMapper.INSTANCE.toDto(teacher);

        return ResponseEntity.ok(TeacherDto);
    }

    @PostMapping("/add-teacher")
    public ResponseEntity<TeacherDto> addTeacher(@RequestBody TeacherDto TeacherDto) {
        Teacher teacher = teacherService.addTeacher(TeacherMapper.INSTANCE.toEntity(TeacherDto));

        if(teacher == null) return ResponseEntity.internalServerError().build();

        TeacherDto TeacherDtoResponse = TeacherMapper.INSTANCE.toDto(teacher);

        return ResponseEntity.ok(TeacherDtoResponse);
    }

    @PutMapping("/update-teacher-cost/{teacherId}")
    public ResponseEntity<TeacherDto> updateTeacherSalary(@PathVariable Integer teacherId, @RequestBody TeacherDto TeacherDto) {
        Teacher teacher = teacherService.updateTeacherSalary(teacherId, TeacherMapper.INSTANCE.toEntity(TeacherDto));

        if(teacher == null) return ResponseEntity.badRequest().build();

        TeacherDto TeacherDtoResponse = TeacherMapper.INSTANCE.toDto(teacher);

        return ResponseEntity.ok(TeacherDtoResponse);
    }

    @DeleteMapping("/delete-teacher/{teacherId}")
    public ResponseEntity<?> deleteTeacher(@PathVariable Integer teacherId) {
        teacherService.deleteTeacher(teacherId);

        return ResponseEntity.ok().build();
    }
}
