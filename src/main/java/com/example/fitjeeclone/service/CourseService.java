package com.example.fitjeeclone.service;

import com.example.fitjeeclone.model.Course;
import com.example.fitjeeclone.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course getCourse(Integer courseId) {
        Course course = courseRepository.getReferenceById(courseId);

        return course;
    }

    public Course addCourse(Course course) {
        Course courseResponse = courseRepository.save(course);

        return courseResponse;
    }

    public Course updateCourseDescription(Integer courseId, Course course) {

        Optional<Course> courseResponse = courseRepository.findById(courseId);

        if(!courseResponse.isPresent()) return null;

        courseResponse.get().setDescription(course.getDescription());
        Course response = courseRepository.save(courseResponse.get());

        return response;
    }

    public void deleteCourse(Integer courseId) {
        courseRepository.deleteById(courseId);

        return;
    }
}
