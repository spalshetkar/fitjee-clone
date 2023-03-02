package com.example.fitjeeclone.mapper;

import com.example.fitjeeclone.dto.ProgramDto;
import com.example.fitjeeclone.model.Program;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface ProgramMapper {

    ProgramMapper INSTANCE = Mappers.getMapper(ProgramMapper.class);

    @Mapping(source = "programId", target = "programId")
    @Mapping(source = "programName", target = "programName")
    @Mapping(source = "duration", target = "duration")
    @Mapping(source = "cost", target = "cost")
    ProgramDto toDto(Program program);

    @Mapping(source = "programId", target = "programId")
    @Mapping(source = "programName", target = "programName")
    @Mapping(source = "duration", target = "duration")
    @Mapping(source = "cost", target = "cost")
    Program toEntity(ProgramDto programDto);
}
