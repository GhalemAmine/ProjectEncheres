package fr.eni.projet.encheres.bo;

/**
 * @author Alexandre Mchich
 *
 */

public class Categorie {

	private int id;
	private String nom;

	public Categorie(int id, String nom) {
		super();
		this.setid(id);
		this.setnom(nom);
	}

	public Categorie(String nom) {
		super();
		this.setnom(nom);
	}
	public Categorie() {
		super();
	}

	public String getnom() {
		return nom;
	}

	public void setnom(String nom) {
		this.nom = nom;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}
}