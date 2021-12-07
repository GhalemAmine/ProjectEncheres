package fr.eni.projet.encheres.bo;

import fr.eni.projet.encheres.bo.Adresse;

/**
 * @author Alexandre Mchich
 *
 */

public class Retrait {

	private Integer idRetrait;
	private Adresse Adresse;
	
	public Retrait(Integer idRetrait, Adresse Adresse) {
		super();
		this.idRetrait = idRetrait;
		this.Adresse = 	Adresse;
	}

	public Integer getIdRetrait() {
		return this.idRetrait;
	}

	public void setIdRetrait(Integer idRetrait) {
		this.idRetrait = idRetrait;
	}
	public Adresse getAdresse() {
		return this.Adresse;
	}

	public void setAdresse(Adresse Adresse) {
		this.Adresse = Adresse;
	}
}