package com.student.Students.details.dto.Services;

import com.student.Students.details.dto.Model.DTO.StudentDTO;
import com.student.Students.details.dto.Model.Student;
import com.student.Students.details.dto.Model.StudentMarks;
import com.student.Students.details.dto.Repository.StudentMarksRepo;
import com.student.Students.details.dto.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private StudentMarksRepo studentMarksRepo;

    public Student addstudent(Student student) {

        return studentRepo.save(student);
    }

    public List<Student> getstudent() {
        return studentRepo.findAll();
    }

    public Object getstudentById(long id) {
        return studentRepo.findById(id);
    }

    public void deleteById(long id) {
        studentRepo.deleteById(id);
    }

    public Student updateById(Student student) {
        Student update = studentRepo.findById(student.getId()).orElse(null);
        update.setId(student.getId());
        update.setName(student.getName());
        return studentRepo.save(update);


    }

    public Student saveStudent(StudentDTO studentDTO) {
        Student s = new Student();
        s.setName(studentDTO.getName());
        s = studentRepo.save(s);
        Long rollno = s.getId();
        List<StudentMarks> list = studentDTO.getMarksdto();
        for (StudentMarks student : list) {
            student.setRollNo(rollno);
            student.setSub(student.getSub());
            student.setMarks(student.getMarks());
            studentMarksRepo.save(student);
        }
        return s;
    }
}
