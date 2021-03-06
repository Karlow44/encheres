package fr.eni.encheres.dal;

public abstract class CodesErreursDAL {
/* CONVENTION : codes entre 10000 et 19999 */
	
////
	public static final int ECHEC_LECTURE_LISTE_UTILISATEURS =10001;
	
// Erreur si Les ID ne correspondent pas en BDD
	public static final int ERREURS_IDENTIFIANTS= 10002;
	
// Erreur lors de la création d'un compte utilisateur
	public static final int ERREUR_INSERTION = 10003;
	
// Erreur lors de la suppression du compte de l'utilisateur
	public static final int ERREUR_SUPPRESSION_UTILISATEUR = 10004;
	
// Erreur lors de la mise à jour du compte de l'utilisateur
	public static final int ERREUR_MISE_A_JOUR_UTILISATEUR = 10005;

	public static final int ERREUR_ID = 10006;
//Aucun utilisateur enregistré en BDD
	public static final int ERREUR_AUCUN_UTILISATEUR = 10007;
	
//Aucun article enregistré en BDD
	public static final int ERREUR_AUCUN_ARTICLE = 10008;
	
// Errreur si les noms d'article ne correspondent pas en BDD
	public static final int ERREUR_NOM_DARTICLE = 10009;
	
	public static final int ERREUR_NO_ARTICLE = 10010;
	
// Erreur lors de l'ajout d'un article
	public static final int ERREUR_AJOUT = 10011;
	
// Erreur lors de la suppression de l'article
	public static final int ERREUR_SUPPRESSION_ARTICLE = 10012;
	
// Erreur lors de la mise à jour du compte de l'utilisateur
	public static final int ERREUR_MISE_A_JOUR_ARTICLE = 10013;

	public static final int ERREUR_AUCUNE_ENCHERES = 10014;

	public static final int ERREUR_NO_ENCHERE = 10015;

	public static final int ERREUR_SUPPRESSION_ENCHERE =10016;

	public static final int ERREUR_MISE_A_JOUR_ENCHERE = 10017;

	public static final int ERREUR_AJOUT_ENCHERE = 10018;	
	
	public static final int ERREUR_AUCUNE_CATEGORIE = 10019;
	
	public static final int ERREUR_ID_CATEGORIE = 10020;
	
	public static final int ERREURS_LIBELLE = 10021;
	
	public static final int ERREUR_INSERTION_LIBELLE = 10022;
	
	public static final int ERREUR_SUPPRESSION_CATEGORIE = 10023;
	
	public static final int ERREUR_MISE_A_JOUR_CATEGORIE = 10024;
} 
