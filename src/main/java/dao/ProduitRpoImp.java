package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Produit;

public class ProduitRpoImp implements IProduitRepo{
	EntityManagerFactory emf;
	EntityManager em;
	
	public ProduitRpoImp() {
		emf= Persistence.createEntityManagerFactory("UP_Prod");
		em = emf.createEntityManager();
	}

	public List<Produit> listerProduit() {
		Query q=em.createQuery("Select p from Produit p");
		return q.getResultList();
	}
	
}
