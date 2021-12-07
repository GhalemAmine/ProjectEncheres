/**
 * 
 */
package fr.eni.projet.encheres.bo;

import java.sql.Date;

import fr.eni.projet.encheres.bo.user.Utilisateur;

/**
 * @author Greg
 *
 */
public class Article {

	private Integer id;
	private String nomArticle;
	private String description;
	private Date dateDebut;
	private Date dateFin;
	private int prixInitial;
	private int prixVente;
	private int etatVente;

	// récupération données utilisateur
	private Utilisateur utilisateur;
	private int idUtilisateur;

	// Recupération idUtilisateur
	public int getIdUtilisateur() {
		idUtilisateur = utilisateur.getId();
		return this.idUtilisateur;
	}

	// récupération données Catégorie
	private Categorie categorie;
	private int idCategorie;

	// récupération idCatégorie
	public int getIdCategorie() {
		idCategorie = categorie.getIdCatégorie();
		return this.idCategorie;
	}

	// liste d'encheres par article
	// public List<Encheres> listeEncheres = new ArrayList<Encheres>();

	/**
	 * 
	 */
	public Article() {
		super();
	}

	/**
	 * @param nomArticle
	 * @param description
	 * @param dateDebut
	 * @param dateFin
	 * @param prixInitial
	 * @param prixVente
	 * @param etatVente
	 */
	public Article(String nomArticle, String description, Date dateDebut, Date dateFin, int prixInitial, int prixVente,
			int etatVente) {
		super();
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prixInitial = prixInitial;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
	}

	/**
	 * @param idArticle
	 * @param nomArticle
	 * @param description
	 * @param dateDebut
	 * @param dateFin
	 * @param prixInitial
	 * @param prixVente
	 * @param etatVente
	 */
	public Article(Integer id, String nomArticle, String description, Date dateDebut, Date dateFin, int prixInitial,
			int prixVente, int etatVente) {
		super();
		this.id = id;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prixInitial = prixInitial;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomArticle() {
		return this.nomArticle;
	}

	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public int getPrixInitial() {
		return this.prixInitial;
	}

	public void setPrixInitial(int prixInitial) {
		this.prixInitial = prixInitial;
	}

	public int getPrixVente() {
		return this.prixVente;
	}

	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}

	public int getEtatVente() {
		return this.etatVente;
	}

	public void setEtatVente(int etatVente) {
		this.etatVente = etatVente;
	}

	/*
	 * toString, avant liaison avec autres class
	 * 
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Articles [id=").append(this.id).append(", nomArticle=").append(this.nomArticle)
				.append(", description=").append(this.description).append(", dateDebut=").append(this.dateDebut)
				.append(", dateFin=").append(this.dateFin).append(", prixInitial=").append(this.prixInitial)
				.append(", prixVente=").append(this.prixVente).append(", etatVente=").append(this.etatVente)
				.append("]");
		return builder.toString();
	}

}
