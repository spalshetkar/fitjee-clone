package com.example.fitjeeclone.mapper;

import com.example.fitjeeclone.dto.StudentDto;
import com.example.fitjeeclone.dto.TeacherDto;
import com.example.fitjeeclone.model.Student;
import com.example.fitjeeclone.model.Teacher;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface TeacherMapper {

    TeacherMapper INSTANCE = Mappers.getMapper(TeacherMapper.class);

    @Mapping(source = "teacherId", target = "teacherId")
    @Mapping(source = "teacherName", target = "teacherName")
    @Mapping(source = "salary", target = "salary")
    TeacherDto toDto(Teacher teacher);

    @Mapping(source = "teacherId", target = "teacherId")
    @Mapping(source = "teacherName", target = "teacherName")
    @Mapping(source = "salary", target = "salary")
    Teacher toEntity(TeacherDto teacherDto);
}
