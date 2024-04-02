INSERT INTO utilisateurs (id, pseudo, mdp, admin, scores, pdp) VALUES (1, 'eva', 'sup00', FALSE, '0', NULL);
INSERT INTO utilisateurs (id, pseudo, mdp, admin, scores, pdp) VALUES (2, 'dorian', 'cro00', FALSE, '0', NULL);
INSERT INTO utilisateurs (id, pseudo, mdp, admin, scores, pdp) VALUES (3, 'noriane', 'ber00', TRUE, '0', NULL);

INSERT INTO reponses (id, contenu, solution, question_id) VALUES (1, 'France', TRUE, 1);
INSERT INTO reponses (id, contenu, solution, question_id) VALUES (2, 'Pays-Bas', FALSE, 1);
INSERT INTO reponses (id, contenu, solution, question_id) VALUES (3, 'Emmanuel Macron', FALSE, 2);
INSERT INTO reponses (id, contenu, solution, question_id) VALUES (4, 'Anne Hidalgo', TRUE, 2);

INSERT INTO questions (id, contenu, image, quizz_id) VALUES (1, 'De quel pays Paris est-elle la capitale ?', NULL, 1);
INSERT INTO questions (id, contenu, image, quizz_id) VALUES (2, 'Qui est le maire de Paris actuellement ?', NULL, 1);

INSERT INTO quizzes (id, titre) VALUES (1, 'Tout sur Paris !');
