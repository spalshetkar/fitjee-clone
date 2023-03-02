package com.example.fitjeeclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgramDto {

    private Integer programId;
    private String programName;
    private Integer courseId;
    private Integer duration;
    private Double cost;
}