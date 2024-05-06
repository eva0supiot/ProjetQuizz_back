package com.takima.backskeleton.services;

import com.sun.tools.jconsole.JConsoleContext;
import com.takima.backskeleton.DAO.UtilisateurDao;
import com.takima.backskeleton.models.Utilisateur;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.*;

@Service
@RequiredArgsConstructor
public class UtilisateurService {
    private final UtilisateurDao utilisateurDao;

    public List<Utilisateur> findAll() {
        Iterable<Utilisateur> it = utilisateurDao.findAll();
        List <Utilisateur> users = new ArrayList<>();
        it.forEach(users::add);
        return users ;
    }

    public Utilisateur getById(Long id) {
        return utilisateurDao.findById(id).orElseThrow();
    }

    @Transactional
    public void deleteById(Long id) {
        utilisateurDao.deleteById(id);
    }

    @Transactional
    public void addUtilisateur(Utilisateur utilisateur) {
        utilisateurDao.save(utilisateur);
    }

    @Transactional
    public void updateUtilisateur (Utilisateur utilisateur, Long id){
        utilisateurDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("User doesn't exist"));
        //Utilisateur utilisateur;
        utilisateurDao.save(utilisateur);
    }

    public void saveScore(Long id, String newScore) {
        Utilisateur user = utilisateurDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("User doesn't exist"));

        if(Objects.equals(user.getScores(), "0"))
            user.setScores(newScore);
        else
            user.setScores(user.getScores()+"-"+newScore);
        utilisateurDao.save(user);
    }
}
