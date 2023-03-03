package com.example.fitjeeclone.mapper;

import com.example.fitjeeclone.dto.CourseDto;
import com.example.fitjeeclone.dto.SubjectDto;
import com.example.fitjeeclone.model.Course;
import com.example.fitjeeclone.model.Subject;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface CourseMapper {

    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    @Mapping(source = "courseId", target = "courseId")
    @Mapping(source = "courseName", target = "courseName")
    @Mapping(source = "description", target = "description")
    CourseDto toDto(Course course);

    @Mapping(source = "courseId", target = "courseId")
    @Mapping(source = "courseName", target = "courseName")
    @Mapping(source = "description", target = "description")
    Course toEntity(CourseDto course);
}
