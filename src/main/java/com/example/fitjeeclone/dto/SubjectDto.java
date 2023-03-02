package com.example.fitjeeclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDto {
    private Integer subjectId;
    private String subjectName;
    private Integer programId;
}
