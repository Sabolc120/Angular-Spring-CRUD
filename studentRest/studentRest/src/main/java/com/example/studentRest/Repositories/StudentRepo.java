package com.example.studentRest.Repositories;

import com.example.studentRest.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
