package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Question;
import com.takima.backskeleton.models.Quizz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizzDao extends JpaRepository<Quizz, Integer> {
    //@Query("SELECT u FROM utilisateurs u JOIN u.courses c WHERE c.id= :courseId AND u.major.id = :majorId ")
    //List<Utilisateur> findByMajorIdAndCourseId(int majorId, int courseId);
}
