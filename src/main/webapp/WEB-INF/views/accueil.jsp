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
	<nav class="navbar navbar-inverse navbar-static-top">

		<div class="container-fluid">

			<ul class="nav navbar-left">

				<li role="presentation"><a href="<c:url value="/index.html"/>"><span
						class="glyphicon glyphicon-off" aria-hidden="true"></span>
						Se Déconnecter</a></li>

			</ul>

		</div>



		<!-- Banner -->

		<div id="banner">

			<h2>Application ProxiBanque</h2>

			<p>Bienvenue dans votre espace ProxiBanque</p>

			<br>



			<!-- Liste des comptes du client -->

			<div class="panel panel-default">

				<div class="panel-heading">

					Liste des comptes :

				</div>

				<div class="panel-body">

					<table class="table">

						<thead>

							<tr>

								<th>id</th>

								<th>Numero de compte</th>

								<th>Type de compte</th>

								<th>Date d'ouveture</th>

								<th>Solde</th>

							</tr>

						</thead>

						<tbody>

							<c:forEach var="compte" items="${list}">

								<tr>

									<td>${compte.id}</td>

									<td>${compte.numCC}</td>
									
									<td>${compte.typeCompte}</td>								

									<td>${compte.dateOuverture}</td>

									<td>${compte.solde} €</td>

								</tr>

							</c:forEach>

						</tbody>

					</table>

				</div>

			</div>

			<!--<c:url value="/" var="chemin" />-->

			
			<br>

			<form action="${chemin}retrait.html?idCompte=${compte.id}" method="get"
				class="form-inline form-group container">

				<label for="idCompte">ID Compte </label> <select
					class="form-control" name="idCcompte" id="idCompte">

					<c:forEach var="compte" items="${list}">

						<option value="${compte.id}"><c:out value="${compte.id}" /></option>

					</c:forEach>

				</select>
			
				<button type="submit" class="btn btn-success">Effecteur un
					Retrait</button>
			
			</form>


			<br>
			
			
			<!-- A CHANGER POUR UN LIENT PLUTOT QU'UN FORM BOUTON -->
			<a href="${chemin}virement.html?id=${idClient}">

				<button type="submit" class="btn btn-success">Effectuer un
					Virement</button>

			</a>

		</div>


		</div>

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