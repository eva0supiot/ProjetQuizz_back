package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "questions")
@Getter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String contenu;

    @ManyToOne
    @JoinColumn(name = "quizz_id")
    private Quizz quizz;

    //@OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    //private Set<Reponse> reponses = new HashSet<>();
/*
    private Question(Question.Builder builder) {
        this.id = Math.toIntExact(builder.id);
        this.contenu = builder.contenu;
        this.image = builder.image;
        this.quizz = builder.quizz;
    }
    public Question() {
    }

    public static class Builder {
        private Long id;
        private String contenu;

        private String image;

        private Quizz quizz;


        public Question.Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Question.Builder contenu(String name) {
            this.contenu = name;
            return this;
        }

        public Question.Builder image(String image) {
            this.image = image;
            return this;
        }

        public Question.Builder quizz(Quizz quizz) {
            this.quizz = quizz;
            return this;
        }


        public Question build() {
            return new Question(this);
        }
    }*/
}

//