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
@Table(name = "program")
public class Program {
    @Id
    private Integer programId;
    private String programName;
    private Integer courseId;
    private Integer duration;
    private Double cost;
}
