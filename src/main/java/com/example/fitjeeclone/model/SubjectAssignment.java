package com.example.fitjeeclone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subject-assignment")
public class SubjectAssignment {
    @Id
    private Integer assignmentId;
    private Integer teacherId;
    private Integer subjectId;
}
