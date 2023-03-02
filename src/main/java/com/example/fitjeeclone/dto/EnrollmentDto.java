package com.example.fitjeeclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentDto {
    private Integer enrollmentId;
    private Integer studentId;
    private Integer programId;
    private Boolean status;
}
