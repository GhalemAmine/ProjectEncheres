/**
 * 
 */
package fr.eni.projet.encheres.bo;

import java.sql.Date;

/**
 * @author Greg
 *
 */
public class Articles {

	private int idArticle;
	private String nomArticle;
	private String description;
	private Date dateDebut;
	private Date dateFin;
	private int prixInitial;
	private int prixVente;
	private int etatVente;

	// public List<Encheres> listeEncheres = new ArrayList<Encheres>()

	// get idCategorie(); A faire

	// get idUtilisateur(); A faire

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
	public Articles(int idArticle, String nomArticle, String description, Date dateDebut, Date dateFin, int prixInitial,
			int prixVente, int etatVente) {
		super();
		this.idArticle = idArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prixInitial = prixInitial;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
	}

	public int getIdArticle() {
		return this.idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
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
		builder.append("Articles [idArticle=").append(this.idArticle).append(", nomArticle=").append(this.nomArticle)
				.append(", description=").append(this.description).append(", dateDebut=").append(this.dateDebut)
				.append(", dateFin=").append(this.dateFin).append(", prixInitial=").append(this.prixInitial)
				.append(", prixVente=").append(this.prixVente).append(", etatVente=").append(this.etatVente)
				.append("]");
		return builder.toString();
	}

}
