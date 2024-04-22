INSERT INTO utilisateurs (id, pseudo, mdp, admin, scores, pdp) VALUES (1, 'eva', 'sup00', FALSE, '0', NULL);
INSERT INTO utilisateurs (id, pseudo, mdp, admin, scores, pdp) VALUES (2, 'dorian', 'cro00', FALSE, '0', NULL);
INSERT INTO utilisateurs (id, pseudo, mdp, admin, scores, pdp) VALUES (3, 'noriane', 'ber00', TRUE, '0', NULL);

INSERT INTO reponses (id, contenu, solution, question_id) VALUES (1, 'France', TRUE, 1);
INSERT INTO reponses (id, contenu, solution, question_id) VALUES (2, 'Pays-Bas', FALSE, 1);
INSERT INTO reponses (id, contenu, solution, question_id) VALUES (3, 'Emmanuel Macron', FALSE, 2);
INSERT INTO reponses (id, contenu, solution, question_id) VALUES (4, 'Anne Hidalgo', TRUE, 2);
INSERT INTO reponses (id, contenu, solution, question_id) VALUES (5, 'Tour Eiffel', FALSE, 3);
INSERT INTO reponses (id, contenu, solution, question_id) VALUES (6, 'Arc de Triomphe', False, 3);
INSERT INTO reponses (id, contenu, solution, question_id) VALUES (7, 'Palais de lElysée', FALSE, 3);
INSERT INTO reponses (id, contenu, solution, question_id) VALUES (8, 'Sagradafamilia', TRUE, 3);
INSERT INTO reponses (id, contenu, solution, question_id) VALUES (9, 'La Tamise', True, 4);
INSERT INTO reponses (id, contenu, solution, question_id) VALUES (10, 'La Seine', False, 4);

INSERT INTO questions (id, contenu, image, quizz_id) VALUES (1, 'De quel pays Paris est-elle la capitale ?', NULL, 1);
INSERT INTO questions (id, contenu, image, quizz_id) VALUES (2, 'Qui est le maire de Paris actuellement ?', NULL, 1);
INSERT INTO questions (id, contenu, image, quizz_id) VALUES (3, 'Lequel de ces monuments ne se trouve pas à Paris ?', NULL, 1);
INSERT INTO questions (id, contenu, image, quizz_id) VALUES (4, 'Quel est le nom du fleuve qui traverse Londres ?', NULL, 2);

INSERT INTO quizzes (id, titre) VALUES (1, 'Tout sur Paris !');
INSERT INTO quizzes (id, titre) VALUES (2, 'Tout sur Londres !');