<%@page import="fr.eni.projet.encheres.bo.Article"%>
<%@page import="fr.eni.projet.encheres.bo.Article"%>
<%@page import="java.util.List"%>

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
	List<Article> catalogueArticle = (List<Article>) request.getAttribute("catalogueArticle");
	if(catalogueArticle!=null) {
%>
	<table>
		<tbody>
			<%
				for(Article a : catalogueArticle) {
			%>
			<tr>
				<td><%=a.getId() %></td>
				<td><%=a.getNomArticle() %></td>
				<td><%=a.getDescription() %></td>
				<td><%=a.getDateDebut() %></td>
				<td><%=a.getDateFin() %></td>
				<td><%=a.getIdUtilisateur() %></td>
				<td><%=a.getIdCategorie() %></td>
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
<footer>copyright - Will E. Cefes - Et les autres qui mettront leur nom aussi ou alors on aura décidé d'un nom d'entreprise </footer>
</body>
</html>