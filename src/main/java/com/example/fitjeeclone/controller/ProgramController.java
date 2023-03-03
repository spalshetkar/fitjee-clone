package com.example.fitjeeclone.controller;

import com.example.fitjeeclone.dto.ProgramDto;
import com.example.fitjeeclone.mapper.ProgramMapper;
import com.example.fitjeeclone.model.Program;
import com.example.fitjeeclone.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/program")
public class ProgramController {

    @Autowired
    private ProgramService programService;
    
    @GetMapping("/get-program/{programId}")
    public ResponseEntity<ProgramDto> getProgram(@PathVariable Integer programId) {
        Program program = programService.getProgram(programId);

        if(program == null) return ResponseEntity.notFound().build();

        ProgramDto ProgramDto = ProgramMapper.INSTANCE.toDto(program);

        return ResponseEntity.ok(ProgramDto);
    }

    @PostMapping("/add-programÏ")
    public ResponseEntity<ProgramDto> addProgram(@RequestBody ProgramDto ProgramDto) {
        Program program = programService.addProgram(ProgramMapper.INSTANCE.toEntity(ProgramDto));

        if(program == null) return ResponseEntity.notFound().build();

        ProgramDto ProgramDtoResponse = ProgramMapper.INSTANCE.toDto(program);

        return ResponseEntity.ok(ProgramDtoResponse);
    }

    @PutMapping("/update-program-cost/{programId}")
    public ResponseEntity<ProgramDto> updateProgramCost(@PathVariable Integer programId, @RequestBody ProgramDto ProgramDto) {
        Program program = programService.updateProgramCost(programId, ProgramMapper.INSTANCE.toEntity(ProgramDto));

        if(program == null) return ResponseEntity.badRequest().build();

        ProgramDto ProgramDtoResponse = ProgramMapper.INSTANCE.toDto(program);

        return ResponseEntity.ok(ProgramDtoResponse);
    }

    @DeleteMapping("/delete-program/{programId}")
    public ResponseEntity<?> deleteProgram(@PathVariable Integer programId) {
        programService.deleteProgram(programId);

        return ResponseEntity.ok().build();
    }
}
