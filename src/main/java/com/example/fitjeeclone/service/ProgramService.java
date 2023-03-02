package com.example.fitjeeclone.service;

import com.example.fitjeeclone.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramService {

    @Autowired
    private ProgramRepository programRepository;
}
