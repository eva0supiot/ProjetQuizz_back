create table utilisateurs
(
    id SERIAL PRIMARY KEY,
    pseudo VARCHAR(64) not null,
    mdp VARCHAR(64) not null,
    admin BOOL not null,
    scores VARCHAR(256) not null,
    pdp VARCHAR(64) null
);

create table reponses
(
    id SERIAL PRIMARY KEY,
    contenu VARCHAR(256) not null,
    solution BOOL not null,
    question_id INT not null
);

create table questions
(
    id SERIAL PRIMARY KEY,
    contenu VARCHAR(256) not null,
    image BYTEA null,
    quizz_id INT not null
);

create table quizzes
(
    id SERIAL PRIMARY KEY,
    titre VARCHAR(64) not null
);