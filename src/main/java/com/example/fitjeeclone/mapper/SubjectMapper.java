package com.example.fitjeeclone.mapper;

import com.example.fitjeeclone.dto.ProgramDto;
import com.example.fitjeeclone.dto.SubjectDto;
import com.example.fitjeeclone.model.Program;
import com.example.fitjeeclone.model.Subject;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface SubjectMapper {

    SubjectMapper INSTANCE = Mappers.getMapper(SubjectMapper.class);

    @Mapping(source = "subjectId", target = "subjectId")
    @Mapping(source = "subjectName", target = "subjectName")
    @Mapping(source = "programId", target = "programId")
    SubjectDto toDto(Subject subject);

    @Mapping(source = "subjectId", target = "subjectId")
    @Mapping(source = "subjectName", target = "subjectName")
    @Mapping(source = "programId", target = "programId")
    Subject toEntity(SubjectDto subject);
}
