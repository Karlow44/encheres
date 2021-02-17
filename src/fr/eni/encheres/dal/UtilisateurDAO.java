package fr.eni.encheres.dal;

import java.util.List;

import fr.eni.encheres.bo.Utilisateur;

public interface UtilisateurDAO {

	List<Utilisateur> selectAll(); // POur vérifier lors de la connexion si le pseudo est présent en BDD 
									// et lors de la création pour que le pseudo soit unique

}
