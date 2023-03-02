package com.example.fitjeeclone.service;

import com.example.fitjeeclone.model.Enrollment;
import com.example.fitjeeclone.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public Enrollment getEnrollment(Integer enrollmentId) {
        Enrollment enrollment = enrollmentRepository.getReferenceById(enrollmentId);

        return enrollment;
    }

    public Enrollment addEnrollment(Enrollment enrollment) {
        Enrollment enrollmentResponse = enrollmentRepository.save(enrollment);

        return enrollmentResponse;
    }

    public Enrollment updateEnrollmentStatus(Integer enrollmentId, Enrollment enrollment) {
        Optional<Enrollment> enrollmentResponse = enrollmentRepository.findById(enrollmentId);

        if(!enrollmentResponse.isPresent()) return null;

        enrollmentResponse.get().setStatus(enrollment.getStatus());

        return enrollmentResponse.get();
    }
}
