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
	<h1>${msg}</h1>
	<nav class="navbar navbar-inverse navbar-static-top">

		<div class="container-fluid">

			<ul class="nav navbar-left">

				<li role="presentation"><a href="<c:url value="/index.html"/>"><span
						class="glyphicon glyphicon-off" aria-hidden="true"></span>
						Se Déconnecter</a></li>

			</ul>


		</div>




		<!-- Banner -->

		<!-- Banner -->
		<section id="banner">

			<span class="alert alert-danger" role="alert">${erreur}</span>

			<h2>Application ProxiBanque</h2>

			<p>Bienvenue dans votre espace ProxiBanque</p>

			<br>



			<!-- Liste de tous les comptes -->

			<div class="panel panel-default">
				<div class="panel-body">
					<span>Liste des comptes</span>
					<table class="table">
						<thead>
							<tr>
								<th>Id</th>
								<th>Numero de compte</th>
								<th>Type de compte</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="compte" items="${listAllComptes}">
								<tr>
									<td>${compte.id}</td>
									<td>${compte.numCC}</td>
									<td>${compte.typeCompte}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>

			<br>

			<div class="container">
				<form method="post">
					<div class="form-group">
						<label for="compteDebiteur">Id compte à débiter</label> <select
							class="form-control" id="compteDebiteur" name="compteDebiteur">
							<c:forEach var="compte" items="${listClient}">
								<option><c:out value="${compte.numCC}" /></option>
							</c:forEach>
						</select>
					</div>
					<br>



					<div class="form-group row">

						<label for="compteCrediteur">Id compte à créditer</label> <select
							class="form-control" id="compteCrediteur" name="compteCrediteur">

							<c:forEach var="compte" items="${listAllComptes}">

								<option><c:out value="${compte.numCC}" /></option>

							</c:forEach>

						</select>

					</div>

					<br> <label class="sr-only" for="montantVirement">Montant
						(en Euros)</label>

					<div class="input-group">

						<div class="input-group-addon">€</div>

						<input type="number" class="form-control" id="montantVirement"
							name="montantVirement" placeholder="montant">

						<div class="input-group-addon">.00</div>

					</div>

					<br>

					<button type="submit" class="btn btn-success">Confirmer
						Virement</button>

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