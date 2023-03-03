package com.example.fitjeeclone.service;

import com.example.fitjeeclone.model.Program;
import com.example.fitjeeclone.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProgramService {

    @Autowired
    private ProgramRepository programRepository;

    public Program getProgram(Integer programId) {
        Program program = programRepository.getReferenceById(programId);

        return program;
    }

    public Program addProgram(Program program) {
        Program programResponse = programRepository.save(program);

        return programResponse;
    }

    public Program updateProgramCost(Integer programId, Program program) {
        Optional<Program> programResponse = programRepository.findById(programId);

        if(!programResponse.isPresent()) return null;

        programResponse.get().setCost(program.getCost());
        Program response = programRepository.save(programResponse.get());

        return response;
    }

    public void deleteProgram(Integer programId) {
        programRepository.deleteById(programId);

        return;
    }
}
