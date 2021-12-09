use PROJETENCHERES_DB
go

alter table RETRAITS
alter column rue varchar(225);
alter table RETRAITS
alter column ville varchar(225);

alter table UTILISATEURS
alter column nom varchar(225);
alter table UTILISATEURS
alter column prenom varchar(225);
alter table UTILISATEURS
alter column email varchar(225);
alter table UTILISATEURS
alter column rue varchar(225);
alter table UTILISATEURS
alter column ville varchar(225);

alter table ARTICLES
alter column nom varchar(225);
alter table ARTICLES
alter nomArticle nom;