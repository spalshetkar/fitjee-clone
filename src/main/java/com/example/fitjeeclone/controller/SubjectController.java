package com.example.fitjeeclone.controller;

import com.example.fitjeeclone.dto.SubjectDto;
import com.example.fitjeeclone.mapper.SubjectMapper;
import com.example.fitjeeclone.model.Subject;
import com.example.fitjeeclone.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/get-subject/{subjectId}")
    public ResponseEntity<SubjectDto> getSubject(@PathVariable Integer subjectId) {
        Subject subject = subjectService.getSubject(subjectId);

        if(subject == null) return ResponseEntity.notFound().build();

        SubjectDto SubjectDto = SubjectMapper.INSTANCE.toDto(subject);

        return ResponseEntity.ok(SubjectDto);
    }

    @PostMapping("/add-subjectÏ")
    public ResponseEntity<SubjectDto> addSubject(@RequestBody SubjectDto SubjectDto) {
        Subject subject = subjectService.addSubject(SubjectMapper.INSTANCE.toEntity(SubjectDto));

        if(subject == null) return ResponseEntity.notFound().build();

        SubjectDto SubjectDtoResponse = SubjectMapper.INSTANCE.toDto(subject);

        return ResponseEntity.ok(SubjectDtoResponse);
    }

    @PutMapping("/update-subject-cost/{subjectId}")
    public ResponseEntity<SubjectDto> updatesubjectName(@PathVariable Integer subjectId, @RequestBody SubjectDto SubjectDto) {
        Subject subject = subjectService.updateSubjectName(subjectId, SubjectMapper.INSTANCE.toEntity(SubjectDto));

        if(subject == null) return ResponseEntity.badRequest().build();

        SubjectDto SubjectDtoResponse = SubjectMapper.INSTANCE.toDto(subject);

        return ResponseEntity.ok(SubjectDtoResponse);
    }

    @DeleteMapping("/delete-subject/{subjectId}")
    public ResponseEntity<?> deleteSubject(@PathVariable Integer subjectId) {
        subjectService.deleteSubject(subjectId);

        return ResponseEntity.ok().build();
    }
}
