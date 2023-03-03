package com.example.fitjeeclone.controller;

import com.example.fitjeeclone.dto.EnrollmentDto;
import com.example.fitjeeclone.mapper.EnrollmentMapper;
import com.example.fitjeeclone.model.Enrollment;
import com.example.fitjeeclone.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/enrollment")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @GetMapping("/get-enrollment/{enrollmentId}")
    public ResponseEntity<EnrollmentDto> getEnrollment(@PathVariable Integer enrollmentId) {
        Enrollment enrollment = enrollmentService.getEnrollment(enrollmentId);

        if(enrollment == null) return ResponseEntity.notFound().build();

        EnrollmentDto enrollmentDto = EnrollmentMapper.INSTANCE.toDto(enrollment);

        return ResponseEntity.ok(enrollmentDto);
    }

    @PostMapping("/add-enrollment")
    public ResponseEntity<EnrollmentDto> addEnrollment(@RequestBody EnrollmentDto enrollmentDto) {
        Enrollment enrollment = enrollmentService.addEnrollment(EnrollmentMapper.INSTANCE.toEntity(enrollmentDto));

        if(enrollment == null) return ResponseEntity.notFound().build();

        EnrollmentDto enrollmentDtoResponse = EnrollmentMapper.INSTANCE.toDto(enrollment);

        return ResponseEntity.ok(enrollmentDtoResponse);
    }

    @PutMapping("/update-enrollment-status/{enrollmentId}")
    public ResponseEntity<EnrollmentDto> updateEnrollmentStatus(@PathVariable Integer enrollmentId, @RequestBody EnrollmentDto enrollmentDto) {
        Enrollment enrollment = enrollmentService.updateEnrollmentStatus(enrollmentId, EnrollmentMapper.INSTANCE.toEntity(enrollmentDto));

        if(enrollment == null) return ResponseEntity.badRequest().build();

        EnrollmentDto enrollmentDtoResponse = EnrollmentMapper.INSTANCE.toDto(enrollment);

        return ResponseEntity.ok(enrollmentDtoResponse);
    }

    @DeleteMapping("/delete-enrollment/{enrollmentId}")
    public ResponseEntity<?> deleteEnrollment(@PathVariable Integer enrollmentId) {
        enrollmentService.deleteEnrollment(enrollmentId);

        return ResponseEntity.ok().build();
    }
}
