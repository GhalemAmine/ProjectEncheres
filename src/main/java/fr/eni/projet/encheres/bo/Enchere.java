package fr.eni.projet.encheres.bo;

import java.sql.Date;
import java.time.LocalDate;

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

	private Integer idArticle;
	private Integer idVendeur;
	private Date dateEnchere;
	private int montantEnchere;
	// public List<Vendeur> listeVenseurs = new ArrayList<Vendeur>();

	public Enchere() {

	}

	public Enchere(int montantEnchere, Article article, Vendeur vendeur) {

		this.idVendeur = vendeur.getId();
		this.idArticle = article.getId();
		this.dateEnchere = Date.valueOf(LocalDate.now());
		this.montantEnchere = montantEnchere;

	}
	
	public Enchere(Date dateEnchere, int montantEnchere, Article article, Vendeur vendeur) {

		this.idVendeur = vendeur.getId();
		this.idArticle = article.getId();
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;

	}

	public Date getDateEnchere() {
		if(dateEnchere==null) {
			this.dateEnchere = Date.valueOf(LocalDate.now());
		}
		
		
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

	public Integer getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Article article) {
		this.idArticle = article.getId();
	}

	public Integer getIdVendeur() {
		return idVendeur;
	}

	public void setIdVendeur(Vendeur vendeur) {
		this.idVendeur = vendeur.getId();
	}

	public void setIdArticle(Integer id) {
		this.idArticle = id;
		
	}

	public void setIdVendeur(Integer id) {
		this.idVendeur= id;
	}

}