package com.example.sis.controller;

import com.example.sis.entity.StudentScore;
import com.example.sis.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/scores")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @GetMapping("/add")
    public String addScoreForm() {
        return "add-score";
    }

    @PostMapping
    public String addScore(StudentScore score) {
        scoreService.addScore(score);
        return "redirect:/students";
    }
}
