package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {
    //@Query("SELECT u FROM utilisateurs u JOIN u.courses c WHERE c.id= :courseId AND u.major.id = :majorId ")
    //List<Utilisateur> findByMajorIdAndCourseId(int majorId, int courseId);
}
