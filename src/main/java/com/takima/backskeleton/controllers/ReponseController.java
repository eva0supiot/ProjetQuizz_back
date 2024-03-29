package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Reponse;
import com.takima.backskeleton.services.ReponseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("reponses")
@RestController
@RequiredArgsConstructor
public class ReponseController {
    private final ReponseService reponseService;

    @GetMapping("")
    public List<Reponse> getAllCourses() {
        return reponseService.findAll();
    }
}
//