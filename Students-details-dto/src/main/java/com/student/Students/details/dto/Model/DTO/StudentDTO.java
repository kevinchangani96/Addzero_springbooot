package com.student.Students.details.dto.Model.DTO;

import com.student.Students.details.dto.Model.StudentMarks;
import lombok.Data;

import java.util.List;

@Data
public class StudentDTO {
    private  Integer id;
    private  String  name;
    private List<StudentMarks> marksdto;



}
