package com.example.fitjeeclone.repository;

import com.example.fitjeeclone.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
