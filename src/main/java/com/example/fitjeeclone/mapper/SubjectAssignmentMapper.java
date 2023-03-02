package com.example.fitjeeclone.mapper;

import com.example.fitjeeclone.dto.CourseDto;
import com.example.fitjeeclone.dto.SubjectAssignmentDto;
import com.example.fitjeeclone.model.Course;
import com.example.fitjeeclone.model.SubjectAssignment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface SubjectAssignmentMapper {

    SubjectAssignmentMapper INSTANCE = Mappers.getMapper(SubjectAssignmentMapper.class);

    @Mapping(source = "assignmentId", target = "assignmentId")
    @Mapping(source = "teacherId", target = "teacherId")
    @Mapping(source = "subjectId", target = "subjectId")
    SubjectAssignmentDto toDto(SubjectAssignment subjectAssignment);

    @Mapping(source = "assignmentId", target = "assignmentId")
    @Mapping(source = "teacherId", target = "teacherId")
    @Mapping(source = "subjectId", target = "subjectId")
    SubjectAssignment toEntity(SubjectAssignmentDto subjectAssignment);
}
