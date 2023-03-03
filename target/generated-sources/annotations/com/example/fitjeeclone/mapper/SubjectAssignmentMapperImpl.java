package com.example.fitjeeclone.mapper;

import com.example.fitjeeclone.dto.SubjectAssignmentDto;
import com.example.fitjeeclone.model.SubjectAssignment;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-03T13:26:44+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class SubjectAssignmentMapperImpl implements SubjectAssignmentMapper {

    @Override
    public SubjectAssignmentDto toDto(SubjectAssignment subjectAssignment) {
        if ( subjectAssignment == null ) {
            return null;
        }

        SubjectAssignmentDto subjectAssignmentDto = new SubjectAssignmentDto();

        subjectAssignmentDto.setAssignmentId( subjectAssignment.getAssignmentId() );
        subjectAssignmentDto.setTeacherId( subjectAssignment.getTeacherId() );
        subjectAssignmentDto.setSubjectId( subjectAssignment.getSubjectId() );

        return subjectAssignmentDto;
    }

    @Override
    public SubjectAssignment toEntity(SubjectAssignmentDto subjectAssignment) {
        if ( subjectAssignment == null ) {
            return null;
        }

        SubjectAssignment subjectAssignment1 = new SubjectAssignment();

        subjectAssignment1.setAssignmentId( subjectAssignment.getAssignmentId() );
        subjectAssignment1.setTeacherId( subjectAssignment.getTeacherId() );
        subjectAssignment1.setSubjectId( subjectAssignment.getSubjectId() );

        return subjectAssignment1;
    }
}
