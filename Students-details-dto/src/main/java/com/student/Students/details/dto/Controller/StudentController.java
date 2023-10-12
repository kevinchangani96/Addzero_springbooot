package com.student.Students.details.dto.Controller;

import com.student.Students.details.dto.Model.DTO.StudentDTO;
import com.student.Students.details.dto.Model.Student;
import com.student.Students.details.dto.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;
//single object will be save
    @PostMapping("/add")
    public Student addstudent(@RequestBody Student student) {
        return studentService.addstudent(student);
    }
    //All detail will be save.
    @PostMapping("/save")
    public Student saveStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.saveStudent(studentDTO);
    }

    @GetMapping("/get")
    public List<Student> getstudent() {
        return studentService.getstudent();
    }

    @GetMapping("/find")
    public Object getstudentById(@RequestParam long id) {
        return studentService.getstudentById(id);

    }

    @DeleteMapping("/delete")
    public void deleteById(@RequestParam long id) {
        studentService.deleteById(id);
    }

    @PutMapping("/update")
    public Student updateById(@RequestBody Student student) {
        return studentService.updateById(student);
    }
}
