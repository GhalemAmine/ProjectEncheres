/**
 * 
 */
package fr.eni.projet.encheres.dal;

import fr.eni.projet.encheres.bo.Enchere;

/**
 * @author Gaspode
 *
 */
public interface DAOEnchere extends DAO<Enchere> {
	public Enchere selectByID(Integer idUtilisateur, Integer idArticle) throws DALException; 
	public void deleteByID(Integer idUtilisateur, Integer idArticle) throws DALException;

}
