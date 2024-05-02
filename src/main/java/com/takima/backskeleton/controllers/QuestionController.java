package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Question;
import com.takima.backskeleton.models.Quizz;
import com.takima.backskeleton.services.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("questions")
@RestController
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping("")
    public List<Question> findAll() {
        return questionService.findAll();
    }

    @GetMapping("byQuizz")
    public List<Question> findbyQuizz(@RequestParam Integer quizzId) {
        return questionService.searchByQuizz(quizzId);
    }

    @DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable Long id) {
        questionService.deleteById(id);
    }

    @PostMapping("")
    public Question addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }
    @PostMapping("/{id}")
    public void updateQuestion(@RequestBody Question question, @PathVariable Long id) {
        questionService.updateQuestion(question, id);
    }
}
