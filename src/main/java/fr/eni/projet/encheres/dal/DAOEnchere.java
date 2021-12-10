/**
 * 
 */
package fr.eni.projet.encheres.dal;

import java.util.List;

import fr.eni.projet.encheres.bo.Article;
import fr.eni.projet.encheres.bo.Enchere;

/**
 * @author Gaspode
 *
 */
public interface DAOEnchere extends DAO<Enchere> {
	public Enchere selectByID(Integer[] idEnchere) throws DALException; 
	public void deleteByID(Integer[] idEnchere) throws DALException;
	public List<Enchere> selectByArticle(Article art) throws DALException;

}
