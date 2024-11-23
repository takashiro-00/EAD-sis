package com.example.sis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sis.entity.StudentScore;

public interface StudentScoreRepository extends JpaRepository<StudentScore, Integer> {
}
