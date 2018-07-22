<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ProxiBanque</title>
<link rel="stylesheet"
	href="<c:url value = "bootstrap/css/bootstrap.min.css"></c:url>">
<link rel="stylesheet"
	href="<c:url value = "bootstrap/css/style.css"></c:url>">
<script src="<c:url value = "bootstrap/js/bootstrap.min.js"></c:url>"></script>
</head>
<body>



	<!-- Banner -->
	<section id="banner">
		
		<h2>Application ProxiBanque</h2>
		<p>Bienvenue sur l'application ProxiBanque , votre outil de
			gestion de Compte</p>
		<br>

		<form  method="post" class="form-inline">
			<label for="dateNaissance">Date de Naissance </label>
			<div class="form-group">
				<input type="date" class="form-control" id="dateNaissance"
					name="dateNaissance">
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-success btn-lg">Valider</button>
			</div>
		</form>



	</section>


	<!-- Section 1  -->
	<div id="one" class="container-fluid">
		<div class="center">
			<h2>Gestion De Compte</h2>
			<p>L'application ProxiBanque vous offre un outil de gestion pour
				répondre à vos Besoins.</p>
			<br>
		</div>
		<div id="div1" class="center col-xs-4">
			<span class="glyphicon glyphicon-refresh"></span>
			<p>Vous permet de mettre à jour vos informations.</p>
		</div>
		<div id="div1" class="center col-xs-4">
			<span class="glyphicon glyphicon-folder-open"></span>
			<p>Vous permet de consulter votre compte Courant et Epargne.</p>
		</div>
		<div id="div1" class="center col-xs-4">
			<span class="glyphicon glyphicon-euro"></span>
			<p>Vous permet d'effectuer des virements de compte à compte.</p>
		</div>
		</section>
</body>
</html>