package com.example.fitjeeclone.repository;

import com.example.fitjeeclone.model.SubjectAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectAssignmentRepository extends JpaRepository<SubjectAssignment, Integer> {
}
