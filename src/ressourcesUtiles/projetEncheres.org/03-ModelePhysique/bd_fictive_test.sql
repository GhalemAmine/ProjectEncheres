use PROJETENCHERES_DB
go

insert into UTILISATEURS values ('pseudo', 'nom', 'prenom', 'email', 'telephone', 'rue', 'codePostal', 'ville', 'motDePasse', 0, 'false');
insert into UTILISATEURS values ('gaspode', 'freyer', 'william', 'lolvraiment', '3615coucou', 'avenue des trucs', '39500', 'petaouschnoc', 'essaPeDtom', 100000, 'true');
insert into UTILISATEURS values ('Chacal', 'Morane', 'Bob', 'bobibob', 'allo?', 'indochine', '000000', 'Markeujone', 'I<3Blake', 50, 'false');
insert into UTILISATEURS values ('Kiki', 'Dupond', 'David', 'david.dupoud@mail.fr', '0660066006', '12 Chemin des lilas', '69001', 'LYON', 'Kiki69001', 2000, 'false');
insert into UTILISATEURS values ('lolo', 'Lafaillette', 'Adrien', 'adrienl@mail.fr', '0660066007', '2 Chemin des Forges', '69001', 'LYON', 'lolo69001', 2000, 'false');





insert into CATEGORIES values ('categorie');
insert into CATEGORIES values ('sports et loisirs');
insert into CATEGORIES values ('informatique');
insert into CATEGORIES values ('ameublement');
insert into CATEGORIES values ('vetements');




insert into ARTICLES(nomArticle,description,dateDebutEncheres,dateFinEncheres,idUtilisateur,idCategorie) values ('PS5', 'Console de jeu','20211210 00:00:00 AM', '20211220 00:00:00 AM',5,2);
insert into ARTICLES(nomArticle,description,dateDebutEncheres,dateFinEncheres,idUtilisateur,idCategorie) values ('Ballon Foot','Bon état','20211209 00:00:00 AM','20211224 00:00:00 AM',2,2);
insert into ARTICLES(nomArticle,description,dateDebutEncheres,dateFinEncheres,idUtilisateur,idCategorie) values ('Chaussures Nike','Très peu servies, état quasi neuf','20211211 00:00:00 AM','20220115 00:00:00 AM',4,2);
insert into ARTICLES(nomArticle,description,dateDebutEncheres,dateFinEncheres,idUtilisateur,idCategorie) values ('Carte Graphique RTX 3090','Haut de gamme, introuvable','20211221 00:00:00 AM','20220122 00:00:00 AM',5,3);
insert into ARTICLES(nomArticle,description,dateDebutEncheres,dateFinEncheres,idUtilisateur,idCategorie) values ('Souris Gaming Razer','Souris sans fil reçue pour anniversaire','20211209 00:00:00 AM','20221224 00:00:00 AM',4,3);
insert into ARTICLES(nomArticle,description,dateDebutEncheres,dateFinEncheres,idUtilisateur,idCategorie) values ('Table basse','Belle table basse en parfait état','20211209 00:00:00 AM','20220210 00:00:00 AM',2,4);
insert into ARTICLES(nomArticle,description,dateDebutEncheres,dateFinEncheres,idUtilisateur,idCategorie) values ('Lot de tabourets','Lot de 4 non divisible, état moyen, parfait pour cuisine américaine','20211209 00:00:00 AM','20220301 00:00:00 AM',3,4);
insert into ARTICLES(nomArticle,description,dateDebutEncheres,dateFinEncheres,idUtilisateur,idCategorie) values ('Doudoune North Face','Parfait pour l''hiver, en très bon état','20211209 00:00:00 AM','20221215 00:00:00 AM',3,5);
insert into ARTICLES(nomArticle,description,dateDebutEncheres,dateFinEncheres,idUtilisateur,idCategorie) values ('Echarpe Polaire Superdry','Tiens super chaud, je m''en sépare parce qu''elle ne me plait plus.','20211209 00:00:00 AM','20221215 00:00:00 AM',5,5);

