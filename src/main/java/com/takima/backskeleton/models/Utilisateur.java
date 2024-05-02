package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "utilisateurs")
@Getter
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "pseudo")
    private String pseudo;
    @Column(name = "mdp")
    private String mdp;
    @Column(name = "admin")
    private boolean admin;
    @Setter
    @Column(name = "scores")
    private String scores;

    private Utilisateur(Builder builder) {
        this.id = builder.id;
        this.pseudo = builder.pseudo;
        this.mdp = builder.mdp;
        this.admin = builder.admin;
        this.scores = builder.scores;
    }
    public Utilisateur() {
    }

    public static class Builder {
        private Long id;
        private String pseudo;
        private String mdp;
        private boolean admin;
        private String scores;

        public Builder id (Long id) {
            this.id = id;
            return this;
        }

        public Builder pseudo(String firstName) {
            this.pseudo = firstName;
            return this;
        }
        public Builder mdp(String lastName) {
            this.mdp = lastName;
            return this;
        }
        public Builder scores(String scores) {
            this.scores = scores;
            return this;
        }

        public Utilisateur build() {
            return new Utilisateur(this);
        }
    }
}
