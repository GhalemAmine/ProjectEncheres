package fr.eni.exempledao.dal.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.exempledao.dal.DAO;

/**
 * @author William "Gaspode" Freyer
 *
 */
public interface DAOJdbc<T> extends DAO<T> {

	void completeStmt(T t, PreparedStatement stmt) throws SQLException;

	T createFromRS(ResultSet rs) throws SQLException;
}
