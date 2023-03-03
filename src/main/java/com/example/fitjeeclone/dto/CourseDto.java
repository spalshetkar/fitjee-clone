package com.example.fitjeeclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mapstruct.Mapping;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDto {
    private Integer courseId;
    private String courseName;
    private String description;
}
