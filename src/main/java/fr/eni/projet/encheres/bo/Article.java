/**
 * 
 */
package fr.eni.projet.encheres.bo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import fr.eni.projet.encheres.bo.user.Utilisateur;
import fr.eni.projet.encheres.bo.user.Vendeur;

/**
 * @author Greg
 *
 */
public class Article {

	// Attributs Article
	private Integer id;
	private String nomArticle;
	private String description;
	private Date dateDebut;
	private Date dateFin;
	private int prixInitial;
	private int prixVente;
	private int etatVente;
//	private Integer idUtilisateur;
//	private Integer idCategorie;

	// Attributs Utilisateur
	private Utilisateur user;
	List<Utilisateur> listeUser = new ArrayList<Utilisateur>();

//	// Attributs Vendeur
//	private Vendeur vend;
//	List<Vendeur> listeVendeur = new ArrayList<Vendeur>();

	// Attributs Categorie
	private Categorie cat;
	List<Categorie> listeCat = new ArrayList<Categorie>();

	// Attributs Enchere
	private Enchere enc;
	List<Enchere> listeEnc = new ArrayList<Enchere>();

	// Attributs Retrait
	private Retrait ret;

//	// Méthodes Vendeur
//	public Vendeur getVendeur() {
//		return this.vend;
//	}
//  
//	public Integer getIdVendeur() {
//		return this.vend.getId();
//	}

	// Méthodes Utilisateur
	public Utilisateur getUtilisateur() {
		this.user = (Vendeur) user;
		((Vendeur) this.user).ajouterArticle(this);
		return this.user;
	}

	public Integer getIdUtilisateur() {
		return this.user.getId();
	}

	public void setIdUtilisateur(Integer id) {
		this.user.setId(id);
	}

	public void setIdUtilisateur(Vendeur vend) {
		this.user.setId(id);
	}

//	public void setIdUtilisateur(Utilisateur user) {
//		this.idUtilisateur = user.getId();
//	}

//	public void setIdUtilisateur(Integer id) {
//		this.idUtilisateur = id;
//	}

	// Méthodes Categorie
	public Categorie getCategorie() {
		this.cat.ajouterArticle(this);
		return this.cat;
	}

	public Integer getIdCategorie() {
		return this.cat.getId();
	}

	public void setIdCategorie(Integer id) {
		this.cat.setId(id);
	}

//	public void setIdCategorie(Categorie cat) {
//		this.idCategorie = cat.getId();
//	}
//
//	public void setIdCategorie(Integer id) {
//		this.idCategorie = id;
//	}

	// Méthodes Enchere
	public Enchere getEnchere() {
		return this.enc;
	}

	public void setEnchere(Enchere enc) {
		this.enc = enc;
	}

	// Méthodes Retrait
	public Retrait getRetrait() {
		return this.ret;
	}

	public void setRetrait(Retrait ret) {
		this.ret = ret;
	}

	// Methodes Article
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
		this.user.getId();
		this.cat.getId();
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
		this.user.getId();
		this.cat.getId();
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Article [id=").append(this.id).append(", nomArticle=").append(this.nomArticle)
				.append(", description=").append(this.description).append(", dateDebut=").append(this.dateDebut)
				.append(", dateFin=").append(this.dateFin).append(", prixInitial=").append(this.prixInitial)
				.append(", prixVente=").append(this.prixVente).append(", etatVente=").append(this.etatVente)
				.append(", idUtilisateur=").append(this.getIdUtilisateur()).append(", user=").append(this.user)
				.append(", idCategorie=").append(this.getIdCategorie()).append(", cat=").append(this.cat)
				.append(", enc=").append(this.enc).append(", listeEnc=").append(this.listeEnc).append(", ret=")
				.append(this.ret).append("]");
		return builder.toString();
	}

}
