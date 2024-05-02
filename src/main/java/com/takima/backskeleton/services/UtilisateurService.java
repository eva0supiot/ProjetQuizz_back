package com.takima.backskeleton.services;

import com.sun.tools.jconsole.JConsoleContext;
import com.takima.backskeleton.DAO.UtilisateurDao;
import com.takima.backskeleton.models.Utilisateur;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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

    /*public void saveScore(Long id, String newscore) {
        utilisateurDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("User doesn't exist"));
        Utilisateur user = utilisateurDao.getById(id);
        user.setScores(user.getScores()+newscore);
        utilisateurDao.save(user);
    }

    @Transactional
    public void saveScores(Long id, String newScore) {
        // Recherche de l'utilisateur par ID
        Utilisateur utilisateur = utilisateurDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Utilisateur non trouvé"));

        // Mettre à jour le score de l'utilisateur avec la nouvelle valeur
        utilisateur.setScores(newScore);

        // Sauvegarde de l'utilisateur mis à jour dans la base de données
        utilisateurDao.save(utilisateur);
    }*/

    public void saveScore(Long id, String newScore) {
        Utilisateur user = utilisateurDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("User doesn't exist"));
        // Traitement de la nouvelle valeur de score selon vos besoins
        user.setScores(user.getScores()+"-"+newScore);
        utilisateurDao.save(user);
    }

}
