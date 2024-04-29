package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.QuestionDao;
import com.takima.backskeleton.models.Question;
import com.takima.backskeleton.models.Quizz;
import com.takima.backskeleton.models.Reponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionDao questionDao;
    public List<Question> findAll() {
        Iterable<Question> it = questionDao.findAll();
        List <Question> questions = new ArrayList<>();
        it.forEach(questions::add);
        return questions;
    }

    public List<Question> searchByQuizz(int quizzId) {
        return questionDao.findByQuizzId(quizzId);
    }

    @Transactional
    public void deleteById(Long id) {
        questionDao.deleteById(Math.toIntExact(id));
    }

    @Transactional
    public void addQuestion(Question question) {
        questionDao.save(question);
    }

    @Transactional
    public void updateQuestion (Question question, Long id){
        questionDao.findById(Math.toIntExact(id))
                .orElseThrow(() -> new NoSuchElementException("Quizz doesn't exist"));
        //Utilisateur utilisateur;
        questionDao.save(question);
    }
}
