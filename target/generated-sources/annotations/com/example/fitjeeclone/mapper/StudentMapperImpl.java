package com.example.fitjeeclone.mapper;

import com.example.fitjeeclone.dto.StudentDto;
import com.example.fitjeeclone.model.Student;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-03T13:26:44+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentDto toDto(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDto studentDto = new StudentDto();

        studentDto.setStudentId( student.getStudentId() );
        studentDto.setStudentName( student.getStudentName() );

        return studentDto;
    }

    @Override
    public Student toEntity(StudentDto studentDto) {
        if ( studentDto == null ) {
            return null;
        }

        Student student = new Student();

        student.setStudentId( studentDto.getStudentId() );
        student.setStudentName( studentDto.getStudentName() );

        return student;
    }
}
