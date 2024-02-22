INSERT INTO majors (name, description) VALUES ('Informatique', 'Expertise en développement informatique et solutions numériques');
INSERT INTO majors (name, description) VALUES ('Batiment', 'Spécialisation dans la conception de structures solides et matériaux innovants');
INSERT INTO majors (name, description) VALUES ('Aéronautique', 'Maîtrise des technologies aéronautiques et spatiales');
INSERT INTO majors (name, description) VALUES ('Data', ' Gestion avancée des données avec un focus sur l''ingénierie des données');
INSERT INTO majors (name, description) VALUES ('Energie & Environnement', 'Engagement pour des solutions énergétiques durables et respectueuses de l''environnement');
INSERT INTO majors (name, description) VALUES ('Management', 'Formation axée sur les compétences de gestion pour diriger des équipes techniques');
INSERT INTO majors (name, description) VALUES ('Santé', 'Connaissance approfondie de l''anatomie humaine et des technologies médicales');
INSERT INTO majors (name, description) VALUES ('IArchitecture durable', ' Objectif de conception d''architectures durables avec un impact carbone minimal.');
INSERT INTO majors (name, description) VALUES ('Industriel Durable', 'Exploration des concepts de design industriel avec un accent sur la durabilité');

INSERT INTO students (first_name, last_name, birthdate, major_id) VALUES ('Paul', 'Harrohide', '2002-06-15', 1);
INSERT INTO students (first_name, last_name, birthdate, major_id) VALUES ('Jean', 'Bonbeur', '2001-08-21', 1);
INSERT INTO students (first_name, last_name, birthdate, major_id) VALUES ('Alain', 'Térieur', '2000-01-11', 1);

INSERT INTO courses (name, hours) VALUES ('Spanish', 30);
INSERT INTO courses (name, hours) VALUES ('German', 30);
INSERT INTO courses (name, hours) VALUES ('Internet of Things', 30);
INSERT INTO courses (name, hours) VALUES ('Thermodynamic', 30);
INSERT INTO courses (name, hours) VALUES ('Anatomy', 30);
INSERT INTO courses (name, hours) VALUES ('Maths', 30);
INSERT INTO courses (name, hours) VALUES ('Java', 30);
INSERT INTO courses (name, hours) VALUES ('Lean Management', 30);
INSERT INTO student_course (student_id, course_id) VALUES (1, 7);


