package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.ReponseDao;
import com.takima.backskeleton.models.Reponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ReponseService {
    private final ReponseDao reponseDao;

    public List<Reponse> findAll() {
        return reponseDao.findAll();
    }
}
