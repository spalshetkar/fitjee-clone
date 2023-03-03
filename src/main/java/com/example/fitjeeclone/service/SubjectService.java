package com.example.fitjeeclone.service;

import com.example.fitjeeclone.model.Subject;
import com.example.fitjeeclone.model.SubjectAssignment;
import com.example.fitjeeclone.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public Subject getSubject(Integer subjectId) {
        return subjectRepository.getReferenceById(subjectId);
    }

    public Subject addSubject(Subject subject) {
        Subject response = subjectRepository.save(subject);

        return response;
    }

    public Subject updateSubjectName(Integer subjectId, Subject subject) {
        Optional<Subject> subjectResponse = subjectRepository.findById(subjectId);

        if(!subjectResponse.isPresent()) return null;

        subjectResponse.get().setSubjectName(subject.getSubjectName());
        Subject response = subjectRepository.save(subjectResponse.get());

        return response;
    }

    public void deleteSubject(Integer subjectId) {
        subjectRepository.deleteById(subjectId);

        return;
    }
}
