package com.example.fitjeeclone.controller;

import com.example.fitjeeclone.dto.CourseDto;
import com.example.fitjeeclone.dto.EnrollmentDto;
import com.example.fitjeeclone.mapper.CourseMapper;
import com.example.fitjeeclone.mapper.EnrollmentMapper;
import com.example.fitjeeclone.model.Course;
import com.example.fitjeeclone.model.Enrollment;
import com.example.fitjeeclone.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/get-course/{courseId}")
    public ResponseEntity<CourseDto> getCourse(@PathVariable Integer courseId) {
        Course course = courseService.getCourse(courseId);

        if(course == null) return ResponseEntity.notFound().build();

        CourseDto courseDto = CourseMapper.INSTANCE.toDto(course);

        return ResponseEntity.ok(courseDto);
    }

    @PostMapping("/add-course")
    public ResponseEntity<CourseDto> addCourse(@RequestBody CourseDto courseDto) {
        Course course = courseService.addCourse(CourseMapper.INSTANCE.toEntity(courseDto));

        if(course == null) return ResponseEntity.notFound().build();

        CourseDto courseDtoResponse = CourseMapper.INSTANCE.toDto(course);

        return ResponseEntity.ok(courseDtoResponse);
    }

    @PutMapping("/update-course-description/{courseId}")
    public ResponseEntity<CourseDto> updateCourseDescription(@PathVariable Integer courseId, @RequestBody CourseDto courseDto) {
        Course course = courseService.updateCourseDescription(courseId, CourseMapper.INSTANCE.toEntity(courseDto));

        if(course == null) return ResponseEntity.badRequest().build();

        CourseDto courseDtoResponse = CourseMapper.INSTANCE.toDto(course);

        return ResponseEntity.ok(courseDtoResponse);
    }

    @DeleteMapping("/delete-course/{courseId}")
    public ResponseEntity<?> deleteCourse(@PathVariable Integer courseId) {
        courseService.deleteCourse(courseId);

        return ResponseEntity.ok().build();
    }
}
