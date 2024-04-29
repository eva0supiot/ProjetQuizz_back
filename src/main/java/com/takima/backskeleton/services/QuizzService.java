package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.QuizzDao;
import com.takima.backskeleton.models.Quizz;
import com.takima.backskeleton.models.Reponse;
import com.takima.backskeleton.models.Utilisateur;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
public class QuizzService {
    private final QuizzDao quizzDao;
    public List<Quizz> findAll() {
        Iterable<Quizz> it = quizzDao.findAll();
        List <Quizz> quizzes = new ArrayList<>();
        it.forEach(quizzes::add);
        return quizzes;
    }

    public Quizz getById(Long id) {
        return quizzDao.findById(Math.toIntExact(id)).orElseThrow();
    }

    @Transactional
    public void deleteById(Long id) {
        quizzDao.deleteById(Math.toIntExact(id));
    }

    @Transactional
    public void addQuizz(Quizz quizz) {
        quizzDao.save(quizz);
    }

    @Transactional
    public void updateQuizz (Quizz quizz, Long id){
        quizzDao.findById(Math.toIntExact(id))
                .orElseThrow(() -> new NoSuchElementException("Quizz doesn't exist"));
        //Utilisateur utilisateur;
        quizzDao.save(quizz);
    }
}
