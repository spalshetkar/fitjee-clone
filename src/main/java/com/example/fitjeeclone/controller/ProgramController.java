package com.example.fitjeeclone.controller;

import com.example.fitjeeclone.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/program")
public class ProgramController {

    @Autowired
    private ProgramService programService;
}
