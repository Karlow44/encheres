package fr.eni.encheres.bll;

import java.util.Date;
import java.util.List;

import fr.eni.encheres.BusinessException;
import fr.eni.encheres.bo.ArticleVendu;

import fr.eni.encheres.dal.ArticleVenduDAO;
import fr.eni.encheres.dal.DAOFactory;

public class ArticleManager {

	private ArticleVenduDAO daoArticleVendu;

	public ArticleManager() {
		daoArticleVendu = DAOFactory.getArticleVenduDAO();
	}

	public ArticleVendu retournerArticle(String nomArticle) throws BusinessException {
		return daoArticleVendu.selectByNomArticle(nomArticle);
	}

	public List<ArticleVendu> listeArticles() throws BusinessException {
		return daoArticleVendu.selectAll();
	}

	public ArticleVendu ajoutArticleVendu(String nomArticle, String description, Date dateDebutEnchere,
			Date dateFinEnchere, int miseAPrix, int prixVente, int noUtilisateur, int noCategorie)
			throws BusinessException {

		ArticleVendu articleVendu = new ArticleVendu();
		articleVendu.setNomArticle(nomArticle);
		articleVendu.setDescription(description);
		articleVendu.setDateDebutEncheres(dateDebutEnchere);
		articleVendu.setDateFinEncheres(dateFinEnchere);
		articleVendu.setMiseAPrix(miseAPrix);
		articleVendu.setPrixVente(prixVente);
		articleVendu.setNoUtilisateur(noUtilisateur);
		articleVendu.setNoCategorie(noCategorie);

		this.daoArticleVendu.ajoutArticle(articleVendu);

		return articleVendu;
	}

	public void supprimerArticle(int no_Article) throws BusinessException {
		this.daoArticleVendu.supprimerArticle(no_Article);
	}

	public void modifierArticle(ArticleVendu articleVendu) throws BusinessException {

		this.daoArticleVendu.modifierArticle(articleVendu);
	}

}
