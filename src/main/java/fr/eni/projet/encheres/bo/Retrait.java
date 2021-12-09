package fr.eni.projet.encheres.bo;

/**
 * @author Alexandre Mchich
 * 
 * 
 * @update by William : Changement de Article article en Integer idArticle Ajout
 *         d'un constructeur vide Modification nomemclature
 */

public class Retrait {

	private Integer IdArticle;
	private Adresse adresse;

	public Retrait() {

	}

	public Retrait(Adresse adresse, Article article) {
		this.IdArticle = article.getId();
		this.adresse = adresse;
	}

	public Integer getIdArticle() {

		return this.IdArticle;
	}

	public void setIdArticle(Article article) {
		this.IdArticle = article.getId();
	}

	public Adresse getAdresse() {
		return this.adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
}