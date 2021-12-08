/**
 * 
 */
package fr.eni.projet.encheres.bo.user;

import java.util.ArrayList;
import java.util.List;

import fr.eni.projet.encheres.bo.Adresse;
import fr.eni.projet.encheres.bo.Article;

/**
 * @author William Freyer
 *
 */
public class Vendeur extends Utilisateur {

	private int credit = 0;

	private List<Article> listeArticles = new ArrayList<Article>();

	public Vendeur() {

	}

	public Vendeur(String nom, String prenom, String pseudo, String mdp, String email, Adresse adresse) {
		super(nom, prenom, pseudo, mdp, email, adresse);
	}

	public Vendeur(Integer id, String nom, String prenom, String pseudo, String mdp, String email, Adresse adresse) {
		super(id, nom, prenom, pseudo, mdp, email, adresse);
	}

	public int getCredit() {
		return this.credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public List<Article> getListeArticles() {
		return this.listeArticles;
	}

	public void setListeArticles(List<Article> listeArticles) {
		this.listeArticles = listeArticles;
	}

	public void ajouterArticle(Article article) {
		this.listeArticles.add(article);
		// ne pas oublier de set l'utilisateur sur l'article à ce moment aussi
	}

	@Override
	public void setAdministrateur(boolean administrateur) {
		if(!this.isAdministrateur())
		System.err.println("tu pensais vraiment qu'avec tes droits de base tu pourrais devenir un Admin ?");
		
	}

}
