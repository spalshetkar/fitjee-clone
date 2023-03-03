package com.example.fitjeeclone.mapper;

import com.example.fitjeeclone.dto.CourseDto;
import com.example.fitjeeclone.model.Course;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-03T13:26:44+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class CourseMapperImpl implements CourseMapper {

    @Override
    public CourseDto toDto(Course course) {
        if ( course == null ) {
            return null;
        }

        CourseDto courseDto = new CourseDto();

        courseDto.setCourseId( course.getCourseId() );
        courseDto.setCourseName( course.getCourseName() );

        return courseDto;
    }

    @Override
    public Course toEntity(CourseDto course) {
        if ( course == null ) {
            return null;
        }

        Course course1 = new Course();

        course1.setCourseId( course.getCourseId() );
        course1.setCourseName( course.getCourseName() );

        return course1;
    }
}
