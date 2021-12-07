package fr.eni.projet.encheres.dal;

import fr.eni.projet.encheres.dal.jdbc.exempleobjet.ExempleObjetDAOJdbcImpl;

/**
 * @author William "Gaspode" Freyer
 *
 */
public class DAOFactory {

	public static DAOExempleObjet getExempleObjetDAO() {
		DAOExempleObjet exempleObjetDAO = new ExempleObjetDAOJdbcImpl();
		return exempleObjetDAO;
	}

}
