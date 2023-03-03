package com.example.fitjeeclone.mapper;

import com.example.fitjeeclone.dto.EnrollmentDto;
import com.example.fitjeeclone.model.Enrollment;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-03T13:26:44+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
public class EnrollmentMapperImpl implements EnrollmentMapper {

    @Override
    public EnrollmentDto toDto(Enrollment enrollment) {
        if ( enrollment == null ) {
            return null;
        }

        EnrollmentDto enrollmentDto = new EnrollmentDto();

        enrollmentDto.setEnrollmentId( enrollment.getEnrollmentId() );
        enrollmentDto.setStudentId( enrollment.getStudentId() );
        enrollmentDto.setProgramId( enrollment.getProgramId() );
        enrollmentDto.setStatus( enrollment.getStatus() );

        return enrollmentDto;
    }

    @Override
    public Enrollment toEntity(EnrollmentDto enrollmentDto) {
        if ( enrollmentDto == null ) {
            return null;
        }

        Enrollment enrollment = new Enrollment();

        enrollment.setEnrollmentId( enrollmentDto.getEnrollmentId() );
        enrollment.setStudentId( enrollmentDto.getStudentId() );
        enrollment.setProgramId( enrollmentDto.getProgramId() );
        enrollment.setStatus( enrollmentDto.getStatus() );

        return enrollment;
    }
}
