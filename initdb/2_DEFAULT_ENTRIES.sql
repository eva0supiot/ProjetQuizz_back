INSERT INTO utilisateurs (id, pseudo, mdp, admin, scores, pdp) VALUES (1, 'eva', 'sup00', FALSE, '0', NULL);
INSERT INTO utilisateurs (id, pseudo, mdp, admin, scores, pdp) VALUES (2, 'dorian', 'cro00', FALSE, '0', NULL);
INSERT INTO utilisateurs (id, pseudo, mdp, admin, scores, pdp) VALUES (3, 'noriane', 'ber00', TRUE, '0', NULL);

INSERT INTO reponses (id, contenu, solution) VALUES (1, 'France', TRUE);
INSERT INTO reponses (id, contenu, solution) VALUES (2, 'Pays-Bas', FALSE);
INSERT INTO reponses (id, contenu, solution) VALUES (3, 'Emmanuel Macron', FALSE);
INSERT INTO reponses (id, contenu, solution) VALUES (4, 'Anne Hidalgo', TRUE);

INSERT INTO questions (id, contenu, image, id_reponse1, id_reponse2, id_reponse3, id_reponse4) VALUES (1, 'De quel pays Paris est-elle la capitale ?', NULL, 1, 2, NULL, NULL);
INSERT INTO questions (id, contenu, image, id_reponse1, id_reponse2, id_reponse3, id_reponse4) VALUES (2, 'Qui est le maire de Paris actuellement ?', NULL, 3, 4, NULL, NULL);

INSERT INTO quizzes (id, titre, id_question1, id_question2, id_question3, id_question4, id_question5, id_question6, id_question7, id_question8, id_question9, id_question10) VALUES (1, 'Tout sur Paris !', 1, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
