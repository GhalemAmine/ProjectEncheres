/**
 * 
 */
package fr.eni.projet.encheres.bo.user;

import java.util.ArrayList;
import java.util.List;

import fr.eni.projet.encheres.bo.Adresse;
import fr.eni.projet.encheres.bo.Articles;

/**
 * @author William
 *
 */
public class Vendeur extends Utilisateur {

	private int credit = 0;

	// TODO Remplacer String par Article
	private List<Articles> listeArticles = new ArrayList<Articles>();

	public Vendeur() {

	}

	public Vendeur(String nom, String prenom, String pseudo, String email, Adresse adresse) {
		super(nom, prenom, pseudo, email, adresse);
	}

	public Vendeur(Integer id, String nom, String prenom, String pseudo, String email, Adresse adresse) {
		super(id, nom, prenom, pseudo, email, adresse);
	}

	public int getCredit() {
		return this.credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public List<Articles> getListeArticles() {
		return this.listeArticles;
	}

	public void setListeArticles(List<Articles> listeArticles) {
		this.listeArticles = listeArticles;
	}

	public void ajouterArticle(Articles article) {
		this.listeArticles.add(article);
		// ne pas oublier de set l'utilisateur sur l'article à ce moment aussi
	}

	@Override
	protected void setAdministrateur(boolean administrateur) {
		System.err.println("tu pensais vraiment qu'avec tes droits de base tu pourrais devenir un Admin ?");
	}

}
