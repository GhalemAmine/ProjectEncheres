package fr.eni.projet.encheres.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.projet.encheres.bo.Article;
import fr.eni.projet.encheres.dal.ConnectionProvider;
import fr.eni.projet.encheres.dal.DALException;
import fr.eni.projet.encheres.dal.DAOArticle;

/**
 * @author Greg
 *
 */
public class ArticleDAOJdbcImpl extends DAOJdbcImpl<Article> implements DAOArticle {

	String sqlDeleteByID = "delete from ARTICLES where id=?";
	String sqlInsert = "insert into ARTICLES(nomArticle, description, dateDebutEnchere, dateFinEnchere, prixInitial, prixVente, idUtilisateur, idCategorie) values (?,?,?,?,?,?,?,?)";
	String sqlSelectByID = "select nomArticle, description, dateDebutEnchere, dateFinEnchere, prixInitial, prixVente, idUtilisateur, idCategorie from ARTICLES where id=?";
	String sqlSelectAll = "select id, nomArticle, description, dateDebutEnchere, dateFinEnchere, prixInitial, prixVente, idUtilisateur, idCategorie from ARTICLES";
	String sqlUpdate = "update ARTICLES set nomArticle=?, description=?, dateDebutEnchere=?, dateFinEnchere=?, prixInitial=?, prixVente=?, idUtilisateur=?, idCategorie=?, where id=? ";
	String sqlTruncate = "truncate table ARTICLES";
	String sqlSelectByMotClef = "select id, nomArticle, description, dateDebutEnchere, dateFinEnchere, prixInitial, prixVente, idUtilisateur, idCategorie from ARTICLES where nomArticle like ? "
			+ " or description like ?";
	String sqlSelectByCategorie = "select id, nomArticle, description, dateDebutEnchre, dateFinEnchere, prixInitial, prixVente, idUtilisateur, idCategorie frome ARTICLES where idCategorie=?";

	public ArticleDAOJdbcImpl() {
		setSqlDeleteByID(sqlDeleteByID);
		setSqlSelectAll(sqlSelectAll);
		setSqlSelectByID(sqlSelectByID);
		setSqlTruncate(sqlTruncate);
		setSqlUpdate(sqlUpdate);

	}

	@Override
	public void completeStmt(Article a, PreparedStatement stmt) throws SQLException {

		/*
		 * ordre des attributs nomArticle, description, dateDebutEnchere,
		 * dateFinEnchere, prixInitial, prixVente, idUtilisateur, idCategorie
		 * 
		 */
		int index = 1;
		stmt.setString(index++, a.getNomArticle());
		stmt.setString(index++, a.getDescription());
		stmt.setDate(index++, a.getDateDebut());
		stmt.setDate(index++, a.getDateFin());
		stmt.setInt(index++, a.getPrixInitial());
		stmt.setInt(index++, a.getPrixVente());
		stmt.setInt(index++, a.getIdUtilisateur());
		stmt.setInt(index++, a.getIdCategorie());

		if (a.getId() != null) {
			stmt.setInt(index++, a.getId());
		}
	}

	@Override
	public Article createFromRS(ResultSet rs) throws SQLException {
		Article a = new Article();

		a.setId(rs.getInt("id"));
		a.setNomArticle(rs.getString("nom"));
		a.setDescription(rs.getString("description"));
		a.setDateDebut(rs.getDate("dateDebutEnchere"));
		a.setDateFin(rs.getDate("dateFinEnchere"));
		a.setPrixInitial(rs.getInt("prixInitial"));
		a.setPrixVente(rs.getInt("prixVente"));
		a.setIdUtilisateur(rs.getInt("idUtilisateur"));
		a.setIdCategorie(rs.getInt("idCategorie"));

		return a;
	}

	@Override
	public void delete(Article a) throws DALException {
		this.deleteByID(a.getId());

	}

	@Override
	public void insert(Article a) throws DALException {
		String sql = sqlInsert;
		try (Connection con = ConnectionProvider.getConnection();
				PreparedStatement stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
				ResultSet rs = null;) {
			completeStmt(a, stmt);
			stmt.execute();
			a.setId(JdbcTools.recupID(stmt, rs));
		} catch (SQLException e) {
			throw new DALException("erreur de requete Insert", e);

		}
	}

	@Override
	public List<Article> selectByMotClef(String motClef) throws DALException {
		String sql = sqlSelectByMotClef;
		List<Article> liste = new ArrayList<Article>();
		Article a = null;
		try (Connection con = ConnectionProvider.getConnection(); PreparedStatement stmt = con.prepareStatement(sql);) {
			stmt.setString(1, motClef);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				a = new Article(rs.getInt("id"), rs.getString("nomArticle"), rs.getString("description"),
						rs.getDate("dateDebutEnchere"), rs.getDate("dateFinEnchere"), rs.getInt("prixInitial"),
						rs.getInt("prixVente"), rs.getInt("idUtilisateur"), rs.getInt("idCategorie"));
			}
			liste.add(a);
		} catch (SQLException e) {
			throw new DALException("erreur de requête SelectAll", e);
		}
		return liste;
	}

	@Override
	public List<Article> selectByCategorie(int idCategorie) throws DALException {
		String sql = sqlSelectByCategorie;
		List<Article> liste = new ArrayList<Article>();
		Article a = null;
		try (Connection con = ConnectionProvider.getConnection(); PreparedStatement stmt = con.prepareStatement(sql);) {
			stmt.setInt(1, idCategorie);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				a = new Article(rs.getInt("id"), rs.getString("nomArticle"), rs.getString("description"),
						rs.getDate("dateDebutEnchere"), rs.getDate("dateFinEnchere"), rs.getInt("prixInitial"),
						rs.getInt("prixVente"), rs.getInt("idUtilisateur"), rs.getInt("idCategorie"));
			}
			liste.add(a);

		} catch (SQLException e) {
			throw new DALException("erreur de requête SelectAll", e);
		}
		return liste;
	}

}
