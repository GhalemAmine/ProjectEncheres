package fr.eni.projet.encheres.bo;

/**
 * @author Alexandre Mchich
 *
 */

public class Retrait {

	private Article article;
	private Adresse adresse;
	
	public Retrait(Integer idRetrait, Adresse adresse, Article article) {
		super();
		this.article = article;
		this.adresse = 	adresse;
	}

	public Article getarticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	public Adresse getadresse() {
		return this.adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
}