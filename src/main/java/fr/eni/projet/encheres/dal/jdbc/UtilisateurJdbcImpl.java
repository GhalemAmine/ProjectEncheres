package fr.eni.projet.encheres.dal.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import fr.eni.projet.encheres.bo.Adresse;
import fr.eni.projet.encheres.bo.user.Utilisateur;
import fr.eni.projet.encheres.dal.DALException;
import fr.eni.projet.encheres.dal.DAOUtilisateur;

/**
 * @author William "Gaspode" Freyer
 *
 */

public class UtilisateurJdbcImpl extends DAOJdbcImpl<Utilisateur> implements DAOUtilisateur {

	@Override
	public List<Utilisateur> selectAll() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur selectByID(Integer id) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Utilisateur t) throws DALException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByID(Integer id) throws DALException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Utilisateur t) throws DALException {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(Utilisateur t) throws DALException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() throws DALException {
		// TODO Auto-generated method stub

	}

	@Override
	public void completeStmt(Utilisateur t, PreparedStatement stmt) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Utilisateur createFromRS(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adresse recupAdresse(Integer id) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

}
