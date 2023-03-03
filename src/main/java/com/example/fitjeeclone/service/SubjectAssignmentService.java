package com.example.fitjeeclone.service;

import com.example.fitjeeclone.model.SubjectAssignment;
import com.example.fitjeeclone.repository.SubjectAssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubjectAssignmentService {

    @Autowired
    private SubjectAssignmentRepository subjectAssignmentRepository;

    public SubjectAssignment getSubjectAssignment(Integer assignmentId) {
        return subjectAssignmentRepository.getReferenceById(assignmentId);
    }

    public SubjectAssignment addSubjectAssignment(SubjectAssignment subjectAssignment) {
        SubjectAssignment response = subjectAssignmentRepository.save(subjectAssignment);

        return response;
    }

    public SubjectAssignment updateSubjectAssignmentTeacher(Integer assignmentId, SubjectAssignment subjectAssignment) {
        Optional<SubjectAssignment> subjectAssignmentResponse = subjectAssignmentRepository.findById(assignmentId);

        if(!subjectAssignmentResponse.isPresent()) return null;

        subjectAssignmentResponse.get().setTeacherId(subjectAssignment.getTeacherId());
        SubjectAssignment response = subjectAssignmentRepository.save(subjectAssignmentResponse.get());

        return response;
    }

    public void deleteSubjectAssignment(Integer assignmentId) {
        subjectAssignmentRepository.deleteById(assignmentId);

        return;
    }
}
