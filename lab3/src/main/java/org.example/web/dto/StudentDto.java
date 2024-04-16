package org.example.web.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class StudentDto {

    private Integer id;

    private String firstName;

    private String lastName;

    private String department;

    private String enrollment;

}
