package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Question;
import com.takima.backskeleton.models.Reponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReponseDao extends JpaRepository<Reponse, Long> {
    @Query("SELECT rep FROM Reponse rep WHERE rep.question.id= :questionId")
    List<Reponse> findByQuestionId(int questionId);
}
