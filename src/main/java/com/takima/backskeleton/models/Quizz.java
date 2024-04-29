package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "quizzes")
@Getter
public class Quizz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titre;
    @OneToMany(mappedBy = "quizz")
    @JsonIgnore
    private List<Question> questions;

    private Quizz(Quizz.Builder builder) {
        this.id = builder.id;
        this.titre = builder.titre;
    }
    public Quizz() {
    }

    public static class Builder {
        private Long id;
        private String titre;


        public Quizz.Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Quizz.Builder titre(String name) {
            this.titre = name;
            return this;
        }


        public Quizz build() {
            return new Quizz(this);
        }
    }
}
