package com.example.sis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sis.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
