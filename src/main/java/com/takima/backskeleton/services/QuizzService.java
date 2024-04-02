package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.QuizzDao;
import com.takima.backskeleton.models.Quizz;
import com.takima.backskeleton.models.Reponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

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

    @Transactional
    public void addQuizz(Quizz quizz) {
        quizzDao.save(quizz);
    }
}
