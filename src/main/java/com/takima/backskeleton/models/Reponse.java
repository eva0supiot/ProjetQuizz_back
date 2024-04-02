package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.takima.backskeleton.models.Question;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "reponses")
@NoArgsConstructor
@Getter
public class Reponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String contenu;
    private boolean solution;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "question_id")
    private Question question;
}
