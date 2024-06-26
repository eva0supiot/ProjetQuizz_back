package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Quizz;
import com.takima.backskeleton.services.QuizzService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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

    @DeleteMapping("/{id}")
    public void deleteQuizz(@PathVariable Long id) {
        quizzService.deleteById(id);
    }

    @PostMapping("")
    public ResponseEntity<Quizz> addQuizz(@RequestBody Quizz quizz) {
        Quizz newQuizz = quizzService.addQuizz(quizz);
        return ResponseEntity.ok().body(newQuizz);
    }

    @PostMapping("/{id}")
    public void updateQuizz(@RequestBody Quizz quizz, @PathVariable Long id) {
        quizzService.updateQuizz(quizz, id);
    }

    @GetMapping("/{id}")
    public Quizz findById(@PathVariable Integer id) {
        return quizzService.findById(id);
    }
}
