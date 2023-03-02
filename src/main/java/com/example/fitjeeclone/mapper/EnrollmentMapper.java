package com.example.fitjeeclone.mapper;

import com.example.fitjeeclone.dto.EnrollmentDto;
import com.example.fitjeeclone.model.Enrollment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EnrollmentMapper {

    EnrollmentMapper INSTANCE = Mappers.getMapper(EnrollmentMapper.class);

    @Mapping(source = "enrollmentId", target = "enrollmentId")
    @Mapping(source = "studentId", target = "studentId")
    @Mapping(source = "programId", target = "programId")
    @Mapping(source = "status", target = "status")
    EnrollmentDto toDto(Enrollment enrollment);

    @Mapping(source = "enrollmentId", target = "enrollmentId")
    @Mapping(source = "studentId", target = "studentId")
    @Mapping(source = "programId", target = "programId")
    @Mapping(source = "status", target = "status")
    Enrollment toEntity(EnrollmentDto enrollmentDto);

}
