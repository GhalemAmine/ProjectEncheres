package fr.eni.projet.encheres.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.projet.encheres.bll.BLLException;
import fr.eni.projet.encheres.bll.CategorieManager;
import fr.eni.projet.encheres.bo.Categorie;

/**
 * Servlet implementation class ServeletTestDBCategorie
 */
@WebServlet("/ServeletTestDBCategorie")

public class ServeletTestDBCategorie extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Categorie Jeu = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletTestDBCategorie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		try {
		
		 CategorieManager categorieManager = new CategorieManager();
		categorieManager.addItem(Jeu);
		//categorieManager.updateItem(Jeu);
		//categorieManager.delateItem(Jeu);	
		} catch (BLLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

