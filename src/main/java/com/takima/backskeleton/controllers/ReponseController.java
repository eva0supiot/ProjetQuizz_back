package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Question;
import com.takima.backskeleton.models.Reponse;
import com.takima.backskeleton.services.ReponseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("reponses")
@RestController
@RequiredArgsConstructor
public class ReponseController {
    private final ReponseService reponseService;

    @GetMapping("")
    public List<Reponse> getAllReponses() {
        return reponseService.findAll();
    }

    @GetMapping("byQuestion")
    public List<Reponse> findbyQuestion(@RequestParam Integer questionId) {
        return reponseService.searchByQuestion(questionId);
    }
    @DeleteMapping("/{id}")
    public void deleteReponse(@PathVariable Long id) {
        reponseService.deleteById(id);
    }

    @PostMapping("")
    public void addReponse(@RequestBody Reponse reponse) {
        reponseService.addReponse(reponse);
    }

    @PostMapping("/{id}")
    public void updateReponse(@RequestBody Reponse reponse, @PathVariable Long id) {
        reponseService.updateReponse(reponse, id);
    }
}
