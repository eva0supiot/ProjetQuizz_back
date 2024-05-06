INSERT INTO utilisateurs (pseudo, mdp, admin, scores, pdp) VALUES ('eva', 'sup00', FALSE, '1:3/3-2:0/1', 'PhotoProfil2');
INSERT INTO utilisateurs (pseudo, mdp, admin, scores, pdp) VALUES ('dorian', 'cro00', FALSE, '1:3/3-2:0/1', 'PhotoProfil4');
INSERT INTO utilisateurs (pseudo, mdp, admin, scores, pdp) VALUES ('noriane', 'ber00', TRUE, '1:3/3-2:0/1', 'PhotoProfil5');

INSERT INTO reponses (contenu, solution, question_id) VALUES ('France', TRUE, 1);
INSERT INTO reponses (contenu, solution, question_id) VALUES ('Pays-Bas', FALSE, 1);
INSERT INTO reponses (contenu, solution, question_id) VALUES ('Emmanuel Macron', FALSE, 2);
INSERT INTO reponses (contenu, solution, question_id) VALUES ('Anne Hidalgo', TRUE, 2);
INSERT INTO reponses (contenu, solution, question_id) VALUES ('Tour Eiffel', FALSE, 3);
INSERT INTO reponses (contenu, solution, question_id) VALUES ('Arc de Triomphe', False, 3);
INSERT INTO reponses (contenu, solution, question_id) VALUES ('Palais de lElysée', FALSE, 3);
INSERT INTO reponses (contenu, solution, question_id) VALUES ('Sagradafamilia', TRUE, 3);
INSERT INTO reponses (contenu, solution, question_id) VALUES ('La Tamise', True, 4);
INSERT INTO reponses (contenu, solution, question_id) VALUES ('La Seine', False, 4);

INSERT INTO questions (contenu, image, quizz_id) VALUES ('De quel pays Paris est-elle la capitale ?', NULL, 1);
INSERT INTO questions (contenu, image, quizz_id) VALUES ('Qui est le maire de Paris actuellement ?', NULL, 1);
INSERT INTO questions (contenu, image, quizz_id) VALUES ('Lequel de ces monuments ne se trouve pas à Paris ?', NULL, 1);
INSERT INTO questions (contenu, image, quizz_id) VALUES ('Quel est le nom du fleuve qui traverse Londres ?', NULL, 2);

INSERT INTO quizzes (titre) VALUES ('Tout sur Paris !');
INSERT INTO quizzes (titre) VALUES ('Tout sur Londres !');