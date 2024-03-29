package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Quizz;
import com.takima.backskeleton.services.QuizzService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("quizzes")
@RestController
@RequiredArgsConstructor
public class QuizzController {
    private final QuizzService quizzService;

    @GetMapping("")
    public List<Quizz> findAll() {
        return quizzService.findAll();
    }
}
