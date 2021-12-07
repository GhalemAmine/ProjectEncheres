package fr.eni.projet.encheres.dal;

import java.util.List;

import fr.eni.projet.encheres.bo.Article;

public interface DAOArticle extends DAO<Article> {

	public Article sqlSelectByID(int id) throws DALException;

	public List<Article> sqlSelectAll() throws DALException;

	public void sqlInsert(Article article) throws DALException;

	public void sqlUpdate(Article article) throws DALException;

	public void sqlDeleteByID(int id) throws DALException;

}
