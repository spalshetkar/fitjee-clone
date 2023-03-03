package com.example.fitjeeclone.controller;

import com.example.fitjeeclone.dto.StudentDto;
import com.example.fitjeeclone.mapper.StudentMapper;
import com.example.fitjeeclone.model.Student;
import com.example.fitjeeclone.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentController() {
    }

    @GetMapping("/get-student/{studentId}")
    public ResponseEntity<StudentDto> getStudent(@PathVariable Integer studentId) {
        Student student = studentService.getStudent(studentId);

        if(student == null) return ResponseEntity.notFound().build();

        StudentDto studentDto = StudentMapper.INSTANCE.toDto(student);

        return ResponseEntity.ok(studentDto);
    }

    @PostMapping("/add-student")
    public ResponseEntity<StudentDto> addStudent(@RequestBody StudentDto studentDto) {
        Student student = studentService.addStudent(StudentMapper.INSTANCE.toEntity(studentDto));

        if(student == null) return ResponseEntity.internalServerError().build();

        StudentDto studentDtoResponse = StudentMapper.INSTANCE.toDto(student);

        return ResponseEntity.ok(studentDtoResponse);
    }

    @PutMapping("/update-student-cost/{studentId}")
    public ResponseEntity<StudentDto> updateStudentName(@PathVariable Integer studentId, @RequestBody StudentDto studentDto) {
        Student student = studentService.updateStudentName(studentId, StudentMapper.INSTANCE.toEntity(studentDto));

        if(student == null) return ResponseEntity.badRequest().build();

        StudentDto studentDtoResponse = StudentMapper.INSTANCE.toDto(student);

        return ResponseEntity.ok(studentDtoResponse);
    }

    @DeleteMapping("/delete-student/{studentId}")
    public ResponseEntity<?> deletestudent(@PathVariable Integer studentId) {
        studentService.deletestudent(studentId);

        return ResponseEntity.ok().build();
    }
}
