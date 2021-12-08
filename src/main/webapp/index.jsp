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

<title>Bienvenue</title>

<!-- CSS -->
<link href="style/reset.css" rel="stylesheet">
<link href="style/style.css" rel="stylesheet">



</head>
<body>
<header>Page Temporaire pour initialisation application</header>
<main>
<h1>C'est ici que tout commence</h1>
<a href="<%=this.getServletContext().getContextPath()%>/ServletAccueil">Cliquez ici pour voir les enchères</a>
</main>
<footer>copyright - Will E. Cefes </footer>
</body>
</html>