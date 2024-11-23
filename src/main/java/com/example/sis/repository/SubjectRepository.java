package com.example.sis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sis.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
