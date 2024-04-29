package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Utilisateur;
import com.takima.backskeleton.services.UtilisateurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("utilisateurs")
@RestController
@RequiredArgsConstructor
public class UtilisateurController {
    private final UtilisateurService utilisateurService;
    @GetMapping("")
    public List<Utilisateur> listUtilisateurs() {
        return utilisateurService.findAll();
    }

    @GetMapping("/{id}")
    public Utilisateur getUtilisateurById(@PathVariable Long id) {
        return utilisateurService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable Long id) {
        utilisateurService.deleteById(id);
    }

    @PostMapping("")
    public void addUtilisateur(@RequestBody Utilisateur utilisateur) {
        utilisateurService.addUtilisateur(utilisateur);
    }

    @PostMapping("/{id}")
    public void updateUtilisateur(@RequestBody Utilisateur utilisateur, @PathVariable Long id) {
        utilisateurService.updateUtilisateur(utilisateur, id);
    }

}
