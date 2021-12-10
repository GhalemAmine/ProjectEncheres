/**
 * 
 */
package fr.eni.projet.encheres.dal.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.projet.encheres.bll.ArticleManager;
import fr.eni.projet.encheres.bll.BLLException;
import fr.eni.projet.encheres.bll.UtilisateurManager;
import fr.eni.projet.encheres.bo.Article;
import fr.eni.projet.encheres.bo.Enchere;
import fr.eni.projet.encheres.bo.user.Vendeur;
import fr.eni.projet.encheres.dal.ConnectionProvider;
import fr.eni.projet.encheres.dal.DALException;
import fr.eni.projet.encheres.dal.DAOEnchere;

/**
 * @author Gaspode
 *
 */

public class EnchereJdbcImpl extends DAOJdbcImpl<Enchere> implements DAOEnchere {

	String sqlDeleteByID = "delete from Encheres where idUtilisateur=? AND idArticle=?";
	String sqlInsert = "insert into Encheres(idUtilisateur, idArticle, dateEnchere, montantEnchere) values (?,?,?,?)";
	String sqlSelectByID = "select idUtilisateur, idArticle, dateEnchere, montantEnchere from ENCHERES where idUtilisateur=? AND idArticle=?";
	String sqlSelectAll = "select idUtilisateur, idArticle, dateEnchere, montantEnchere from ENCHERES";
	String sqlUpdate = "update ENCHERES set idUtilisateur=?, dateEnchere=?, montantEnchere=?, where idUtilisateur=? AND idArticle=?";
	String sqlTruncate = "truncate table ENCHERES";
	String sqlSelectByArticle = "select idUtilisateur, idArticle, dateEnchere, montantEnchere from ENCHERES where idArticle=?";

	public EnchereJdbcImpl() {
		setSqlDeleteByID(sqlDeleteByID);
		setSqlSelectAll(sqlSelectAll);
		setSqlSelectByID(sqlSelectByID);
		setSqlTruncate(sqlTruncate);
		setSqlUpdate(sqlUpdate);
	}

	// avec un seul id impossible de trouver une enchère simple, pour prévenir des
	// erreurs la method a été réécrite pour avertir l'utilisateur
	// et elle ne renvoit rien pour éviter des conflits.
	// il est possible d'y mettre un throw new Exception
	@Override
	public Enchere selectByID(Integer id) throws DALException {

		System.err.println("Il manque un paramètre pour la recherche");
		return null;
	}

	// la clef de Enchere n'est pas un simple ID, c'est la combinaison d'un article
	// ET d'un utilisateur, il a donc fallu surcharger la methode pour qu'elle
	// prenne en paramètres
	// les deux id

	public Enchere selectByID(Integer[] idEnchere) throws DALException {

		String sql = sqlSelectByID;
		Enchere enc = null;
		try (Connection con = ConnectionProvider.getConnection(); PreparedStatement stmt = con.prepareStatement(sql);) {

			stmt.setInt(1, idEnchere[1]);
			stmt.setInt(2, idEnchere[0]);
			try (ResultSet rs = stmt.executeQuery();) {

				rs.next();

				enc = createFromRS(rs);
			}

		} catch (SQLException e) {

			throw new DALException("erreur de requete Select by ID", e);
		}

		return enc;
	}

	@Override
	public List<Enchere> selectByArticle(Article art) throws DALException {

		String sql = sqlSelectByArticle;
		List<Enchere> liste = new ArrayList<Enchere>();
		Enchere enc = null;
		try (Connection con = ConnectionProvider.getConnection(); PreparedStatement stmt = con.prepareStatement(sql);) {

			stmt.setInt(1, art.getId());

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				enc = createFromRS(rs);
				liste.add(enc);

			}

		} catch (SQLException e) {

			throw new DALException("erreur de requete SelectByArticle", e);
		}

		return liste;
	}

	@Override
	public void deleteByID(Integer id) throws DALException {
		System.err.println("Il manque un paramètre pour la recherche");
	}

	public void deleteByID(Integer[] idEnchere) throws DALException {
		String sql = sqlDeleteByID;

		try (Connection con = ConnectionProvider.getConnection(); PreparedStatement stmt = con.prepareStatement(sql);) {
			stmt.setInt(1, idEnchere[1]);
			stmt.setInt(2, idEnchere[0]);
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DALException("erreur de suppression", e);
		}
	}

	@Override
	public void delete(Enchere t) throws DALException {

		this.deleteByID(t.getIdEnchere());

	}

	@Override
	public void insert(Enchere t) throws DALException {
		String sql = sqlInsert;
		try (Connection con = ConnectionProvider.getConnection();
				PreparedStatement stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
				ResultSet rs = null;) {
			completeStmt(t, stmt);
			stmt.execute();
		} catch (SQLException e) {
			throw new DALException("erreur de requete Insert", e);

		}
	}

	@Override
	public void completeStmt(Enchere t, PreparedStatement stmt) throws SQLException {
		/*
		 * ordre des attributs : update idUtilisateur, dateEnchere, montantEnchere where
		 * idUtilisateur, idArticle insert idUtilisateur, idArticle, dateEnchere,
		 * montantEnchere
		 * 
		 * Comme tous les paramètres doivent être ajoutés et qu'il n'y a pas le même
		 * nombre en fonction de la requete, il a fallu trouver une astuce pour
		 * différencier les deux requetes, en esperant que
		 * getParameterMetaData().getParameterCount() donne bien le nombre de "?"
		 */
		int nbData = stmt.getParameterMetaData().getParameterCount();
		Integer idUtilisateur = t.getIdEnchere()[1];
		Integer idArticle = t.getIdEnchere()[0];
		Date dateEnchere = t.getDateEnchere();
		int montantEnchere = t.getMontantEnchere();
		int index = 1;
		if (nbData == 5) {
			stmt.setInt(index++, idUtilisateur);
			stmt.setDate(index++, dateEnchere);
			stmt.setInt(index++, montantEnchere);
			stmt.setInt(index++, idUtilisateur);
			stmt.setInt(index++, idArticle);
		} else if (nbData == 4) {
			stmt.setInt(index++, idUtilisateur);
			stmt.setInt(index++, idArticle);
			stmt.setDate(index++, dateEnchere);
			stmt.setInt(index++, montantEnchere);
		}
	}

	@Override
	public Enchere createFromRS(ResultSet rs) throws SQLException {

		Enchere enc = new Enchere();
		Article art;
		Vendeur ven;
		Integer idArticle = rs.getInt("idArticle");
		Integer idUser = rs.getInt("idUtilisateur");

		try {
			ArticleManager artMan = new ArticleManager();
			art = artMan.getItem(idArticle);
			enc.setArticle(art);
		} catch (BLLException e) {
			e.printStackTrace();
		}

		try {
			UtilisateurManager userMan = new UtilisateurManager();
			ven = (Vendeur) userMan.getItem(idUser);
			enc.setVendeur(ven);
		} catch (BLLException e) {
			e.printStackTrace();
		}

		enc.setDateEnchere(rs.getDate("dateEnchere"));
		enc.setMontantEnchere(rs.getInt("montantEnchere"));

		return enc;
	}

}
