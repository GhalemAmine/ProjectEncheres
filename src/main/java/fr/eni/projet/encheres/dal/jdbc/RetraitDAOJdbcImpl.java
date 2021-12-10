package fr.eni.projet.encheres.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import fr.eni.projet.encheres.bll.ArticleManager;
import fr.eni.projet.encheres.bll.BLLException;
import fr.eni.projet.encheres.bo.Adresse;
import fr.eni.projet.encheres.bo.Article;
import fr.eni.projet.encheres.bo.Retrait;
import fr.eni.projet.encheres.dal.ConnectionProvider;
import fr.eni.projet.encheres.dal.DALException;
import fr.eni.projet.encheres.dal.DAORetrait;

/**
 * @author William "Gaspode" Freyer
 *
 */
public class RetraitDAOJdbcImpl extends DAOJdbcImpl<Retrait> implements DAORetrait {

	String sqlDeleteByID = "delete from Retraits where idArticle=?";
	String sqlInsert = "insert into Retraits values (?, ?, ?, ?)";
	String sqlSelectByID = "select idArticle, rue, CodePostal, ville from Retraits where idArticle=?";
	String sqlSelectAll = "select idArticle, rue, CodePostal, ville from Retraits";
	String sqlUpdate = "update Retraits set rue=?, CodePostal=?, ville=? where idArticle=? ";
	String sqlTruncate = "truncate table Retraits";

	public RetraitDAOJdbcImpl() {
		setSqlDeleteByID(sqlDeleteByID);
		setSqlSelectAll(sqlSelectAll);
		setSqlSelectByID(sqlSelectByID);
		setSqlTruncate(sqlTruncate);
		setSqlUpdate(sqlUpdate);
	}

	@Override
	public void completeStmt(Retrait ret, PreparedStatement stmt) throws SQLException {

/*
 * Ordre des paramètres idArticle, rue, CodePostal, Ville		
 */
		Article art = ret.getArticle();
		Adresse adr = ret.getAdresse();
		int index = 1;
		int typeNbr = stmt.getParameterMetaData().getParameterType(index);
		
		if(typeNbr == Types.INTEGER) {
			//si on entre dans cette boucle ça signifie que c'est un insert
			stmt.setInt(index++, art.getId());
		}
			stmt.setString(index++, adr.getRue());
			stmt.setString(index++, adr.getCodePostal());
			stmt.setString(index++, adr.getVille());
		if(typeNbr!=Types.INTEGER) {
			// si on entre ici c'est qu'on est dans un update
			stmt.setInt(index++, art.getId());
		}

	}

	@Override
	public Retrait createFromRS(ResultSet rs) throws SQLException {
		Retrait ret = new Retrait();
		Adresse adr = new Adresse();
		
		
		Article art = null;
		try {
			ArticleManager artMan = new ArticleManager();
			art = artMan.getItem(rs.getInt(1));
		} catch (BLLException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		adr.setRue(rs.getString(2));
		adr.setCodePostal(rs.getString(3));
		adr.setVille(rs.getString(4));
		
		ret.setArticle(art);
		ret.setAdresse(adr);
		
		return ret;
	}

	@Override
	public void delete(Retrait ret) throws DALException {
		this.deleteByID(ret.getIdArticle());

	}

	@Override
	public void insert(Retrait ret) throws DALException {
		String sql = sqlInsert;
		try (Connection con = ConnectionProvider.getConnection();
				PreparedStatement stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
				ResultSet rs = null;) {
			completeStmt(ret, stmt);
			stmt.execute();
		} catch (SQLException e) {
			throw new DALException("erreur de requete Insert", e);

		}
	}

}
