package fr.eni.exempledao.dal;

import fr.eni.exempledao.dal.jdbc.exempleobjet.ExempleObjetDAOJdbcImpl;

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
