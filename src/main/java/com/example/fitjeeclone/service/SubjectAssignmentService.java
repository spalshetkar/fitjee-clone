package com.example.fitjeeclone.service;

import com.example.fitjeeclone.repository.SubjectAssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectAssignmentService {

    @Autowired
    private SubjectAssignmentRepository subjectAssignmentRepository;

}
