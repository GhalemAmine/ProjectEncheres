package fr.eni.projet.encheres.dal;

import fr.eni.projet.encheres.bo.Article;
import fr.eni.projet.encheres.bo.Categorie;
import fr.eni.projet.encheres.bo.user.Utilisateur;
import fr.eni.projet.encheres.dal.jdbc.ArticleDAOJdbcImpl;
import fr.eni.projet.encheres.dal.jdbc.UtilisateurJdbcImpl;
import fr.eni.projet.encheres.dal.jdbc.exempleobjet.ExempleObjetDAOJdbcImpl;

/**
 * @author William "Gaspode" Freyer
 *
 */
public class DAOFactory {

	public static DAOExempleObjet getExempleObjetDAO() {
		DAOExempleObjet exempleObjetDAO = new ExempleObjetDAOJdbcImpl();
		return exempleObjetDAO;
	}

	public static DAO<Utilisateur> getUtilisateurDAO() {
		DAOUtilisateur utilisateurDAO = new UtilisateurJdbcImpl();
		return utilisateurDAO;
	}

	public static DAO<Article> getArticleDAO() {
		DAOArticle articleDAO = new ArticleDAOJdbcImpl();
		return articleDAO;
	}

	public static DAO<Categorie> getCategorieDAO() {
		DAOCategorie categorieDAO = new UtilisateurJdbcImpl();
		return categorieDAO;
	}
}
