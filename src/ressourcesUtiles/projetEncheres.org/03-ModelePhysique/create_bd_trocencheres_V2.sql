-- Script de création de la base de données ENCHERES
--   type :      SQL Server 2012
--



USE PROJETENCHERES_DB
GO

CREATE TABLE CATEGORIES (
    id   INTEGER IDENTITY(1,1) NOT NULL,
    libelle        VARCHAR(30) NOT NULL
)

ALTER TABLE CATEGORIES ADD constraint categoriePk PRIMARY KEY (id)

CREATE TABLE ENCHERES (
    idUtilisateur    INTEGER NOT NULL,
    idArticle       INTEGER NOT NULL,
    dateEnchere     datetime NOT NULL,
	montantEnchere  INTEGER NOT NULL

)

ALTER TABLE ENCHERES ADD constraint encherePk PRIMARY KEY (idUtilisateur, idArticle)

CREATE TABLE RETRAITS (
	idArticle         INTEGER NOT NULL,
    rue              VARCHAR(30) NOT NULL,
    codePostal      VARCHAR(15) NOT NULL,
    ville            VARCHAR(30) NOT NULL
)

ALTER TABLE RETRAITS ADD constraint retraitPk PRIMARY KEY  (idArticle)

CREATE TABLE UTILISATEURS (
    id   INTEGER IDENTITY(1,1) NOT NULL,
    pseudo           VARCHAR(30) NOT NULL,
    nom              VARCHAR(30) NOT NULL,
    prenom           VARCHAR(30) NOT NULL,
    email            VARCHAR(20) NOT NULL,
    telephone        VARCHAR(15),
    rue              VARCHAR(30) NOT NULL,
    codePostal      VARCHAR(10) NOT NULL,
    ville            VARCHAR(30) NOT NULL,
    motDePasse     VARCHAR(30) NOT NULL,
    credit           INTEGER NOT NULL,
    administrateur   bit NOT NULL
)

ALTER TABLE UTILISATEURS ADD constraint utilisateurPk PRIMARY KEY (id)


CREATE TABLE ARTICLES (
    id                    INTEGER IDENTITY(1,1) NOT NULL,
    nomArticle                   VARCHAR(30) NOT NULL,
    description                   VARCHAR(300) NOT NULL,
	dateDebutEncheres           DATE NOT NULL,
    dateFinEncheres             DATE NOT NULL,
    prixInitial                  INTEGER,
    prixVente                    INTEGER,
    idUtilisateur                INTEGER NOT NULL,
    idCategorie                  INTEGER NOT NULL
)

ALTER TABLE ARTICLES ADD constraint articlesVendusPk PRIMARY KEY (id)

ALTER TABLE ARTICLES
    ADD CONSTRAINT encheresUtilisateurFk FOREIGN KEY ( idUtilisateur ) REFERENCES UTILISATEURS ( id )
ON DELETE NO ACTION 
    ON UPDATE no action 

ALTER TABLE ENCHERES
    ADD CONSTRAINT encheresArticlesVendusFk FOREIGN KEY ( idArticle )
        REFERENCES ARTICLES ( id )
ON DELETE NO ACTION 
    ON UPDATE no action 

ALTER TABLE RETRAITS
    ADD CONSTRAINT retraitsArticlesVendusFk FOREIGN KEY ( idArticle )
        REFERENCES ARTICLES ( id )
ON DELETE NO ACTION 
    ON UPDATE no action 

ALTER TABLE ARTICLES
    ADD CONSTRAINT articlesVendusCategoriesFk FOREIGN KEY ( idCategorie )
        REFERENCES CATEGORIES ( id )
ON DELETE NO ACTION 
    ON UPDATE no action 

ALTER TABLE ARTICLES
    ADD CONSTRAINT ventesUtilisateurFk FOREIGN KEY ( idUtilisateur )
        REFERENCES UTILISATEURS ( id )
ON DELETE NO ACTION 
    ON UPDATE no action 

