package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.ReponseDao;
import com.takima.backskeleton.models.Reponse;
import com.takima.backskeleton.models.Utilisateur;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ReponseService {
    private final ReponseDao reponseDao;

    public List<Reponse> findAll() {
        return reponseDao.findAll();
    }

    @Transactional
    public void addReponse(Reponse reponse) {
        reponseDao.save(reponse);
    }
}
