package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Reponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReponseDao extends JpaRepository<Reponse, Long> {
}
