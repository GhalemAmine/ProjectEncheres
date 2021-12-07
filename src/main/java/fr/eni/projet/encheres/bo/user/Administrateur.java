/**
 * 
 */
package fr.eni.projet.encheres.bo.user;

import fr.eni.projet.encheres.bo.Adresse;

/**
 * @author William
 *
 */
public class Administrateur extends Vendeur {

	public Administrateur() {
		this.setAdministrateur(true);
	}

	public Administrateur(String nom, String prenom, String pseudo, String email, Adresse adresse) {
		super(nom, prenom, pseudo, email, adresse);
		this.setAdministrateur(true);
	}

	public Administrateur(Integer id, String nom, String prenom, String pseudo, String email, Adresse adresse) {
		super(id, nom, prenom, pseudo, email, adresse);
		this.setAdministrateur(true);
	}

	protected void donnerDroitsAdmin(Utilisateur user) {
		user.setAdministrateur(true);
	}

}
