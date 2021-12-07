package fr.eni.projet.encheres.bo;

/**
 * @author Alexandre Mchich
 *
 */

public class Categorie {

	private int idCatégorie;
	private String nomCategorie;
	public Categorie (int idcategorie, String nomCategorie, int idCatégorie) {
		super();
		this.setIdCatégorie(idCatégorie);
		this.setNomCategorie(nomCategorie);
	}
	public String getNomCategorie() {
		return nomCategorie;
	}
	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}
	public int getIdCatégorie() {
		return idCatégorie;
	}
	public void setIdCatégorie(int idCatégorie) {
		this.idCatégorie = idCatégorie;
	}
}