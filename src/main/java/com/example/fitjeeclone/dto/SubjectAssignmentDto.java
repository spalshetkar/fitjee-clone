package com.example.fitjeeclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectAssignmentDto {
    private Integer assignmentId;
    private Integer teacherId;
    private Integer subjectId;
}