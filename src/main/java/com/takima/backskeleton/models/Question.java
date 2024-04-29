package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "questions")
@Getter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String contenu;
    //private Image image ?
    @OneToMany(mappedBy = "question")
    @JsonIgnore
    private List<Reponse> reponses;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "quizz_id")
    private Quizz quizz;

    private Question(Question.Builder builder) {
        this.id = Math.toIntExact(builder.id);
        this.contenu = builder.contenu;
    }
    public Question() {
    }

    public static class Builder {
        private Long id;
        private String contenu;


        public Question.Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Question.Builder contenu(String name) {
            this.contenu = name;
            return this;
        }


        public Question build() {
            return new Question(this);
        }
    }
}

//