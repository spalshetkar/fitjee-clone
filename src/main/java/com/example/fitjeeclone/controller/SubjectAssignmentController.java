package com.example.fitjeeclone.controller;

import com.example.fitjeeclone.dto.SubjectAssignmentDto;
import com.example.fitjeeclone.mapper.SubjectAssignmentMapper;
import com.example.fitjeeclone.model.SubjectAssignment;
import com.example.fitjeeclone.service.SubjectAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/assignment")
public class SubjectAssignmentController {

    @Autowired
    private SubjectAssignmentService subjectAssignmentService;

    @GetMapping("/get-subjectAssignment/{assignmentId}")
    public ResponseEntity<SubjectAssignmentDto> getsubjectAssignment(@PathVariable Integer assignmentId) {
        SubjectAssignment subjectAssignment = subjectAssignmentService.getSubjectAssignment(assignmentId);

        if(subjectAssignment == null) return ResponseEntity.notFound().build();

        SubjectAssignmentDto SubjectAssignmentDto = SubjectAssignmentMapper.INSTANCE.toDto(subjectAssignment);

        return ResponseEntity.ok(SubjectAssignmentDto);
    }

    @PostMapping("/add-subjectAssignmentÏ")
    public ResponseEntity<SubjectAssignmentDto> addsubjectAssignment(@RequestBody SubjectAssignmentDto SubjectAssignmentDto) {
        SubjectAssignment subjectAssignment = subjectAssignmentService.addSubjectAssignment(SubjectAssignmentMapper.INSTANCE.toEntity(SubjectAssignmentDto));

        if(subjectAssignment == null) return ResponseEntity.notFound().build();

        SubjectAssignmentDto SubjectAssignmentDtoResponse = SubjectAssignmentMapper.INSTANCE.toDto(subjectAssignment);

        return ResponseEntity.ok(SubjectAssignmentDtoResponse);
    }

    @PutMapping("/update-subjectAssignment-name/{assignmentId}")
    public ResponseEntity<SubjectAssignmentDto> updateSubjectAssignmentTeacher(@PathVariable Integer assignmentId, @RequestBody SubjectAssignmentDto SubjectAssignmentDto) {
        SubjectAssignment subjectAssignment = subjectAssignmentService.updateSubjectAssignmentTeacher(assignmentId, SubjectAssignmentMapper.INSTANCE.toEntity(SubjectAssignmentDto));

        if(subjectAssignment == null) return ResponseEntity.badRequest().build();

        SubjectAssignmentDto SubjectAssignmentDtoResponse = SubjectAssignmentMapper.INSTANCE.toDto(subjectAssignment);

        return ResponseEntity.ok(SubjectAssignmentDtoResponse);
    }

    @DeleteMapping("/delete-subjectAssignment/{assignmentId}")
    public ResponseEntity<?> deletesubjectAssignment(@PathVariable Integer assignmentId) {
        subjectAssignmentService.deleteSubjectAssignment(assignmentId);

        return ResponseEntity.ok().build();
    }
}
