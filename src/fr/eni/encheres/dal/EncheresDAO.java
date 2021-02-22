package fr.eni.encheres.dal;

import java.util.List;

import fr.eni.encheres.BusinessException;
import fr.eni.encheres.bo.Enchere;

public interface EncheresDAO {

	List<Enchere> selectAll() throws BusinessException;
	//todo

	Enchere selectByNoEnchere(int id) throws BusinessException;

	void supprimerEnchere(int no_enchere) throws BusinessException;

	void modifierEnchere(Enchere enchere) throws BusinessException;

}
