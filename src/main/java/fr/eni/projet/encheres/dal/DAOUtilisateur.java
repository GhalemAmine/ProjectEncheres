package fr.eni.projet.encheres.dal;

import fr.eni.projet.encheres.bo.Adresse;
import fr.eni.projet.encheres.bo.user.Utilisateur;

public  interface DAOUtilisateur extends DAO<Utilisateur> {

	/**
	 * @author William "Gaspode" Freyer
	 *
	 */
	
	public Adresse recupAdresse(Integer id) throws DALException;
}
