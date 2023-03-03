package com.example.fitjeeclone.mapper;

import com.example.fitjeeclone.dto.ProgramDto;
import com.example.fitjeeclone.model.Program;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-03T13:26:44+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class ProgramMapperImpl implements ProgramMapper {

    @Override
    public ProgramDto toDto(Program program) {
        if ( program == null ) {
            return null;
        }

        ProgramDto programDto = new ProgramDto();

        programDto.setProgramId( program.getProgramId() );
        programDto.setProgramName( program.getProgramName() );
        programDto.setDuration( program.getDuration() );
        programDto.setCost( program.getCost() );
        programDto.setCourseId( program.getCourseId() );

        return programDto;
    }

    @Override
    public Program toEntity(ProgramDto programDto) {
        if ( programDto == null ) {
            return null;
        }

        Program program = new Program();

        program.setProgramId( programDto.getProgramId() );
        program.setProgramName( programDto.getProgramName() );
        program.setDuration( programDto.getDuration() );
        program.setCost( programDto.getCost() );
        program.setCourseId( programDto.getCourseId() );

        return program;
    }
}
