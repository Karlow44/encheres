<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="test.css">

	<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Ubuntu:regular,bold&subset=Latin">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<title>Ajouter une nouvelle vente</title>
</head>
<body>

	<div class="logo">
		<a href="ServletAccueil"><img src="images/logoProjet.png" alt="accueil" height="80" width="150"></img></a>
	</div>
	<div class="navbar">
  <div class="dropdown">
    <button class="dropbtn">MENU <i class="fa fa-bars" aria-hidden="true"></i></button>
    
    <div class="dropdown-content">
      <a href="ServletEncheres">Enchères</a>
      <a href="ServletVendreArticle">Vendre</a>
      
     <c:if test="${empty utilisateur.pseudo}">
      <a href="ServletConnexion">Se connecter</a>
      <a href="ServletSinscrire">S'inscrire</a>
     </c:if>
     <c:if test="${!empty utilisateur.pseudo}">
		<a href="ServletDeconnexion">Se déconnecter</a>
	</c:if>
      
      
    </div>
    </div>
  </div> 
	
	
	<div>

		<ul>

			<li><a href="ServletEncheres">Enchères</a></li>
			<li><a href="ServletVendreArticle">Vendre un article</a></li>
			
			 <c:if test="${empty utilisateur.pseudo}">
			<li><a href="ServletConnexion">Se connecter</a></li>
			<li><a href="ServletSinscrire">S'inscrire</a></li>
			</c:if>
			
			<c:if test="${!empty utilisateur.pseudo}">
				<!-- Si utilisateur connecté, bouton "Se déconnecter" visible et actif -->
				<li><a href="ServletDeconnexion">Se déconnecter</a></li>
			</c:if>
    		
		</ul>

	</div>
	
		<br>
		<h1>ENI Enchères</h1>
		
		<h2>Nouvelle Vente</h2>
		
	
	<div class="ajoutVente">
	
		<label>Article: <input style="text"></label>
		<label>Description: <input style="text" class="descriptionArticle"></label>
		<label><select name="categorie" id="categorie">
   			 	<option value="0">Selectionnez</option>
			    <option value="0">Vêtements</option>
			    <option value="0">Sport et Loisirs</option>
			    <option value="0">Ameublement</option>
			    <option value="0">Informatique</option>
			    <option value="0">Décoration</option>
				</select>
		</label>
		<label>Photo de l'article: <input type="file" id="avatar" name="avatar" style="color:transparent"   ; accept="image/png, image/jpeg, image/gif, image/pdf, image/svg" /></label>
		<label>Mise à prix: <input type="number"></label>
		<label>Début de l'enchère: <input type="date"></label>
		<label>Fin de l'enchère: <input type="date"></label>
		
	
		<label class="retrait">Retirer un Article: </label> <br>
		<label>Rue: <input style="text"></label>
		<label>Code postal: <input style="text"></label>
		<label>Ville: <input style="text"></label>

	
		<button class="button4" type="submit" onclick="window.location.href='http://localhost:8080/projetEncheres/ServletAccueil';"name="annuler">Annuler</button>
        <button class="button4" type="submit" onclick="window.location.href='http://localhost:8080/projetEncheres/ServletMesVentes';"name="enregistrer">Enregistrer</button>
	
	</div>

</body>
		<footer> Copyright 2021 des fifous du net © </footer> 
</html>