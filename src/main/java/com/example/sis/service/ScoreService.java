package com.example.sis.service;

import com.example.sis.entity.StudentScore;
import com.example.sis.repository.StudentScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {
    @Autowired
    private StudentScoreRepository studentScoreRepository;

    public StudentScore addScore(StudentScore score) {
        return studentScoreRepository.save(score);
    }
}
