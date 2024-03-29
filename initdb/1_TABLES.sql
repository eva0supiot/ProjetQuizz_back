create table utilisateurs
(
    id SERIAL PRIMARY KEY,
    pseudo VARCHAR(64) not null,
    mdp VARCHAR(64) not null,
    admin BOOL not null,
    scores VARCHAR(256) not null,
    pdp BYTEA null
);

create table reponses
(
    id SERIAL PRIMARY KEY,
    contenu VARCHAR(256) not null,
    solution BOOL not null
);

create table questions
(
    id SERIAL PRIMARY KEY,
    contenu VARCHAR(256) not null,
    image BYTEA null,
    id_reponse1 INT not null,
    id_reponse2 INT not null,
    id_reponse3 INT null,
    id_reponse4 INT null,
    FOREIGN KEY (id_reponse1) REFERENCES reponses(id),
    FOREIGN KEY (id_reponse2) REFERENCES reponses(id),
    FOREIGN KEY (id_reponse3) REFERENCES reponses(id),
    FOREIGN KEY (id_reponse4) REFERENCES reponses(id)
);

create table quizzes
(
    id SERIAL PRIMARY KEY,
    titre VARCHAR(64) not null,
    id_question1 INT not null,
    id_question2 INT not null,
    id_question3 INT null,
    id_question4 INT null,
    id_question5 INT null,
    id_question6 INT null,
    id_question7 INT null,
    id_question8 INT null,
    id_question9 INT null,
    id_question10 INT null,
    FOREIGN KEY (id_question1) REFERENCES questions(id),
    FOREIGN KEY (id_question2) REFERENCES questions(id),
    FOREIGN KEY (id_question3) REFERENCES questions(id),
    FOREIGN KEY (id_question4) REFERENCES questions(id),
    FOREIGN KEY (id_question5) REFERENCES questions(id),
    FOREIGN KEY (id_question6) REFERENCES questions(id),
    FOREIGN KEY (id_question7) REFERENCES questions(id),
    FOREIGN KEY (id_question8) REFERENCES questions(id),
    FOREIGN KEY (id_question9) REFERENCES questions(id),
    FOREIGN KEY (id_question10) REFERENCES questions(id)
);