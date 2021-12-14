<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1" >
<meta name="description" content="">
<meta name="author" content="Will E. Cefes">

<title>Accueil</title>

<!-- CSS -->
<link href="style/reset.css" rel="stylesheet">
<link href="style/style.css" rel="stylesheet">



</head>
<body>
<header>
<div class="nomAppli"> ENI-Encheres</div>
<h1 class="titrePage">Liste des enchères</h1>



</header>
<main>

<c:if test="${!sessionScope.connecte}">
<div class="wrapper"> 
<%@ include file="fragmentBandeauUserNonConnecte.jspf" %>
</div>
</c:if>
<c:if test="${sessionScope.connecte}">
<div class="wrapper"> 
<%@ include file="fragmentBandeauUserConnecte.jspf" %>
</div>
</c:if>
<nav class="recherche">
<form class="champRecherche">
<input type="search" placeholder="Le nom de l'article contient" >
<label for="categories">Choisissez une catégorie</label>
<input list="categories" id="choixCategorie" name="choixCategorie">
<datalist id="categories">

	<option value="Toutes" selected>
	<option value="Chiens">
	<option value="Carottes">
	<option value="Monocycles">


</datalist>

<input type="submit" value="Valider" >
</form>
</nav>


<div class="listeEncheres">
<div class="article">Un article</div>
<div class="article">Un autre article</div>
<div class="article">Encore un autre article</div>
<div class="article">Pourquoi j'en ai fait quatre ?</div>


</div>





</main>
<footer>copyright - Will E. Cefes - Et les autres qui mettront leur nom aussi ou alors on aura décidé d'un nom d'entreprise </footer>
</body>
</html>