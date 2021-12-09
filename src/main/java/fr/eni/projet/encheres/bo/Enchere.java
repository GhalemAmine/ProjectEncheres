package fr.eni.projet.encheres.bo;

import java.sql.Date;
import fr.eni.projet.encheres.bo.user.Vendeur;
import java.util.List;
import java.util.ArrayList;

/**
 * @author Alexandre Mchich
 *
 *
 * @update William Ajout d'un constructeur vide correction nomenclature
 *         suppression de idEnchere dans le constructeur
 *
 */

public class Enchere {

	private Article article;
	private Vendeur vendeur;
	private Date dateEnchere;
	private int montantEnchere;
	// public List<Vendeur> listeVenseurs = new ArrayList<Vendeur>();

	public Enchere() {

	}

	public Enchere(Date dateEnchere, int montantEnchere, Article article, Vendeur vendeur) {

		this.vendeur = vendeur;
		this.article = article;
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;

	}

	public Date getDateEnchere() {
		return dateEnchere;
	}

	public void setDateEnchere(Date dateEnchere) {
		this.dateEnchere = dateEnchere;
	}

	public int getMontantEnchere() {
		return montantEnchere;
	}

	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Vendeur getVendeur() {
		return vendeur;
	}

	public void setVendeur(Vendeur vendeur) {
		this.vendeur = vendeur;
	}

}