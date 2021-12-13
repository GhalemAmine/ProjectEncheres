<%@page import="fr.eni.projet.encheres.bo.Article"%>
<%@page import="fr.eni.projet.encheres.bo.Categorie"%>
<%@page import="fr.eni.projet.encheres.bo.Adresse"%>
<%@page import="fr.eni.projet.encheres.bo.user.Vendeur"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1" >
<meta name="description" content="">
<meta name="author" content="Greg / Spague - Les Chiens Prodiges">

<title>Fiche Article</title>

<!-- CSS -->
<link href="style/reset.css" rel="stylesheet">
<link href="style/style.css" rel="stylesheet">



</head>
<body>
<header>
<div class="nomAppli"> ENI-Encheres</div>
<h1 class="titrePage">Catalogue Article</h1>
<div class="signIn"> <a href="ServletSignIn">S'inscrire - Se connecter</a> </div>

</header>
<main>

<% 
	
	List<Article> catalogueArticle = (List<Article>)request.getAttribute("catalogueArticle");
	if(catalogueArticle!=null) {
%>
	<table>
		<tbody>
			<%
				for(Article a : catalogueArticle) {
					Vendeur vend = (Vendeur)a.getUtilisateur();
					Adresse ads = (Adresse)a.getAdresse();
					Categorie cat = (Categorie)a.getCategorie();
					
			%>
			<tr>
				<td><%=a.getId() %></td>
				<td><%=a.getNomArticle() %></td>
				<td><%=a.getDescription() %></td>
				<td><%=a.getDateDebut() %></td>
				<td><%=a.getDateFin() %></td>
				<td><%=vend.getId() %></td>
				<td><%=vend.getNom() %></td>
				<td><%=vend.getPrenom() %></td>
				<td><%=vend.getPseudo() %></td>
				<td><%=vend.getEmail() %></td>
<%-- 				<td><%=ads.getRue() %></td>
				<td><%=ads.getCodePostal() %></td>
				<td><%=ads.getVille() %></td> --%>
				<td><%=cat.getId() %></td>
				<td><%=cat.getNom() %></td>
				
								
			</tr>
			<%
				}
			%>
		</tbody>
		<%
		}
	
		else {
		%>
	
		<p> Aucun article trouvé</p>
		
		<%
		}
		%>
	</table>





</main>
<footer>copyright - Greg / Spague - Les Chiens Prodiges </footer>
</body>
</html>