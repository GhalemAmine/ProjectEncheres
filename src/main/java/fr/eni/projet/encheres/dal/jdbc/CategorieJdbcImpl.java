package fr.eni.projet.encheres.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.projet.encheres.bo.Categorie;
import fr.eni.projet.encheres.bo.ExempleObjet;
import fr.eni.projet.encheres.dal.ConnectionProvider;
import fr.eni.projet.encheres.dal.DALException;
import fr.eni.projet.encheres.dal.DAOExempleObjet;
import fr.eni.projet.encheres.dal.jdbc.DAOJdbcImpl;
import fr.eni.projet.encheres.dal.jdbc.JdbcTools;

/**
 * @author Alexandre Mchich
 *
 */
public class CategorieJdbcImpl extends DAOJdbcImpl<Categorie> implements DaoCategorie {

	String sqlDeleteByID = "delete from Categorie where id=?";
	String sqlInsert = "insert into Categorie(XXXXX, XXXXXXX) values (?,?)";
	String sqlSelectByID = "select id, nom from Categorie where id=?";
	String sqlSelectAll = "select id, nom from Categorie";
	String sqlUpdate = "update Categorie set id=?, nom=?, where id=? ";
	String sqlTruncate = "truncate table Categorie";

	public CategorieJdbcImpl() {
		setSqlDeleteByID(sqlDeleteByID);
		setSqlSelectAll(sqlSelectAll);
		setSqlSelectByID(sqlSelectByID);
		setSqlTruncate(sqlTruncate);
		setSqlUpdate(sqlUpdate);
	}

	@Override
		public void completeStmt(Categorie c, PreparedStatement stmt) throws SQLException {

			int index = 1;
		
			stmt.setString(index++, c.getnom());
			if(c.getid() != null) {
				stmt.setInt(index++, c.getid());
			}
		}

	@Override
	public Categorie createFromRS(ResultSet rs) throws SQLException {
		
		Categorie categorie;
		categorie.setid(rs.getInt("id"));
		categorie.setnom(rs.getString("nom"));
		
//			al.setNom(rs.getString(2));
//			al.setIdRepas(3);
		return categorie;
	}

	@Override
	public void delete(Categorie categorie) throws DALException {
		this.deleteByID(categorie.getid());

	}

	@Override
	public void insert(Categorie categorie) throws DALException {
		String sql = sqlInsert;
		try (Connection con = ConnectionProvider.getConnection();
				PreparedStatement stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
				ResultSet rs = null;) {
			completeStmt(categorie, stmt);
			stmt.execute();
			categorie.setid(JdbcTools.recupID(stmt, rs));
		} catch (SQLException e) {
			throw new DALException("erreur de requete Insert", e);

		}
	}

}
