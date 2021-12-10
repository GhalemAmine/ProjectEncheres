/**
 * 
 */
package fr.eni.projet.encheres.bo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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
//	private Integer idUtilisateur;
//
//	public Utilisateur getUtilisateur() {
//		return this.utilisateur;
//	}
//
//	public void setUtilisateur(Utilisateur user) {
//		this.utilisateur = user;
//	}
	// Recupération utilisateur + mise en place idUtilisateur + MEP list Utilisateur

	private Utilisateur user;

	public Utilisateur getUtilisateur() {
		return this.user;
	}

	private Integer idUtilisateur;

	// Recupération idUtilisateur
	public Integer getIdUtilisateur() {
		return this.idUtilisateur;
	}

	/**
	 * @param idUtilisateur the idUtilisateur to set
	 */
	public void setIdUtilisateur(Utilisateur user) {
		this.idUtilisateur = user.getId();
	}

	public void setIdUtilisateur(Integer id) {
		this.idUtilisateur = id;
	}

	List<Utilisateur> listeUser = new ArrayList<Utilisateur>();

	// RecupérationCategorie + mise en place idCategorie + MEP list categorie

	private Categorie cat;

	public Categorie getCategorie() {
		return this.cat;
	}

	private Integer idCategorie;

	// Recupération idCategorie
	public Integer getIdCategorie() {
		return this.idCategorie;
	}

	public void setIdCategorie(Categorie cat) {
		this.idCategorie = cat.getId();
	}

	public void setIdCategorie(Integer id) {
		this.idCategorie = id;
	}

	List<Categorie> listeCat = new ArrayList<Categorie>();

	// Recupération Enchere + mise en place liste enchere

	// RecupérationCategorie + mise en place idCategorie + MEP list categorie

	private Enchere enc;

	public Enchere getEnchere() {
		return this.enc;
	}

	List<Enchere> listeEnc = new ArrayList<Enchere>();

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
			int prixVente) {
		super();
		this.id = id;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prixInitial = prixInitial;
		this.prixVente = prixVente;

	}

	/**
	 * @param id
	 * @param nomArticle
	 * @param description
	 * @param dateDebut
	 * @param dateFin
	 * @param prixInitial
	 * @param prixVente
	 * @param utilisateur
	 * @param categorie
	 */
	public Article(Integer id, String nomArticle, String description, Date dateDebut, Date dateFin, int prixInitial,
			int prixVente, Utilisateur user, Categorie categorie) {
		super();
		this.id = id;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prixInitial = prixInitial;
		this.prixVente = prixVente;
		this.idUtilisateur = user.getId();
		this.idCategorie = categorie.getId();
	}

	/**
	 * @param id
	 * @param nomArticle
	 * @param description
	 * @param dateDebut
	 * @param dateFin
	 * @param prixInitial
	 * @param prixVente
	 * @param idUtilisateur
	 * @param idCategorie
	 */
	public Article(Integer id, String nomArticle, String description, Date dateDebut, Date dateFin, int prixInitial,
			int prixVente, Integer idUtilisateur, Integer idCategorie) {
		super();
		this.id = id;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prixInitial = prixInitial;
		this.prixVente = prixVente;
		this.idUtilisateur = idUtilisateur;
		this.idCategorie = idCategorie;
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
