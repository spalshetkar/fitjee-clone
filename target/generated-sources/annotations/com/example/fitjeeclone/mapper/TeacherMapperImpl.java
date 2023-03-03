package com.example.fitjeeclone.mapper;

import com.example.fitjeeclone.dto.TeacherDto;
import com.example.fitjeeclone.model.Teacher;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-03T13:26:44+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class TeacherMapperImpl implements TeacherMapper {

    @Override
    public TeacherDto toDto(Teacher teacher) {
        if ( teacher == null ) {
            return null;
        }

        TeacherDto teacherDto = new TeacherDto();

        teacherDto.setTeacherId( teacher.getTeacherId() );
        teacherDto.setTeacherName( teacher.getTeacherName() );
        teacherDto.setSalary( teacher.getSalary() );

        return teacherDto;
    }

    @Override
    public Teacher toEntity(TeacherDto teacherDto) {
        if ( teacherDto == null ) {
            return null;
        }

        Teacher teacher = new Teacher();

        teacher.setTeacherId( teacherDto.getTeacherId() );
        teacher.setTeacherName( teacherDto.getTeacherName() );
        teacher.setSalary( teacherDto.getSalary() );

        return teacher;
    }
}
