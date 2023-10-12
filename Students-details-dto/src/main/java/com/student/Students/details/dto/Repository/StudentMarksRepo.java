package com.student.Students.details.dto.Repository;

import com.student.Students.details.dto.Model.StudentMarks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMarksRepo extends JpaRepository<StudentMarks,Long> {
}
