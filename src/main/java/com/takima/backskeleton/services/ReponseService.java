package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.ReponseDao;
import com.takima.backskeleton.models.Question;
import com.takima.backskeleton.models.Reponse;
import com.takima.backskeleton.models.Utilisateur;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
public class ReponseService {
    private final ReponseDao reponseDao;

    public List<Reponse> findAll() {
        return reponseDao.findAll();
    }

    public List<Reponse> searchByQuestion(int questionId) {
        return reponseDao.findByQuestionId(questionId);
    }
    @Transactional
    public void deleteById(Long id) {
        reponseDao.deleteById(id);
    }

    @Transactional
    public void addReponse(Reponse reponse) {
        reponseDao.save(reponse);
    }

    @Transactional
    public void updateReponse (Reponse reponse, Long id){
        reponseDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Quizz doesn't exist"));
        //Utilisateur utilisateur;
        reponseDao.save(reponse);
    }
}
