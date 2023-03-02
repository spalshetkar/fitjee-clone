package com.example.fitjeeclone.mapper;

import com.example.fitjeeclone.dto.StudentDto;
import com.example.fitjeeclone.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    @Mapping(source = "studentId", target = "studentId")
    @Mapping(source = "studentName", target = "studentName")
    StudentDto toDto(Student student);

    @Mapping(source = "studentId", target = "studentId")
    @Mapping(source = "studentName", target = "studentName")
    Student toEntity(StudentDto studentDto);
}
