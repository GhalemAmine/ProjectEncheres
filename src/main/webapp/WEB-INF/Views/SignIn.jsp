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

<title>Connectez-Vous !</title>

<!-- CSS -->
<link href="style/reset.css" rel="stylesheet">
<link href="style/style.css" rel="stylesheet">


</head>
<body>
<header><div class="nomAppli"> ENI-Encheres</div></header>
<main>


<div class="wrapper">
<p>test</p><p>test</p><p>test</p>
<form method="post" action=#>


Identifiant : <input type="text">
Mot de passe : <input type="password">
<input type="checkbox"> Se souvenir de moi

<a href=#>Mot de passe oublié ?</a>



<input type="submit" value="Se connecter">

</form>
<form action="/ProjectEncheres/ServletProfil" method="get">
<button type="submit">Créer un compte</button>
</form>

</div>


</main>
<footer>copyright - Will E. Cefes </footer>
</body>
</html>