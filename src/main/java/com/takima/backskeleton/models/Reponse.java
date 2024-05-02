package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.takima.backskeleton.models.Question;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "reponses")
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

    private Reponse(Reponse.Builder builder) {
        this.id = Math.toIntExact(builder.id);
        this.contenu = builder.contenu;
        this.solution=builder.solution;
    }
    public Reponse() {
    }

    public static class Builder {
        private Long id;
        private String contenu;
        private boolean solution;


        public Reponse.Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Reponse.Builder contenu(String name) {
            this.contenu = name;
            return this;
        }

        public Reponse.Builder solution(boolean sol) {
            this.solution = sol;
            return this;
        }


        public Reponse build() {
            return new Reponse(this);
        }
    }
}
