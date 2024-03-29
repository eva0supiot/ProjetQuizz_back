package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.QuestionDao;
import com.takima.backskeleton.models.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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
}
