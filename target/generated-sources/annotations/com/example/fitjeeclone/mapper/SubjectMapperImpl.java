package com.example.fitjeeclone.mapper;

import com.example.fitjeeclone.dto.SubjectDto;
import com.example.fitjeeclone.model.Subject;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-03T13:26:44+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class SubjectMapperImpl implements SubjectMapper {

    @Override
    public SubjectDto toDto(Subject subject) {
        if ( subject == null ) {
            return null;
        }

        SubjectDto subjectDto = new SubjectDto();

        subjectDto.setSubjectId( subject.getSubjectId() );
        subjectDto.setSubjectName( subject.getSubjectName() );
        subjectDto.setProgramId( subject.getProgramId() );

        return subjectDto;
    }

    @Override
    public Subject toEntity(SubjectDto subject) {
        if ( subject == null ) {
            return null;
        }

        Subject subject1 = new Subject();

        subject1.setSubjectId( subject.getSubjectId() );
        subject1.setSubjectName( subject.getSubjectName() );
        subject1.setProgramId( subject.getProgramId() );

        return subject1;
    }
}
