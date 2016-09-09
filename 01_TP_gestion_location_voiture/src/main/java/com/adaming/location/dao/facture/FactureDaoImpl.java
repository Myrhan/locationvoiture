package com.adaming.location.dao.facture;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.location.entities.Facture;

public class FactureDaoImpl implements IFactureDao {

	@PersistenceContext
	private EntityManager em;
	
	Logger log = Logger.getLogger("FactureDaoImpl");
	
	@Override
	public Facture add(Facture pObjet) {
		em.persist(pObjet);
		log.info("==== La facture " + pObjet.getIdFacture() + " à bien étée ajoutée ====");
		return pObjet;
	}

	@Override
	public Facture update(Facture pObjet) {
		em.merge(pObjet);
		log.info("==== La facture " + pObjet.getIdFacture() + " à bien étée modifiée ====");
		return pObjet;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Facture> getAll() {
		Query query = em.createQuery("from Facture");
		log.info("==== La liste des factures contient : " + query.getResultList().size() + " factures ====");
		return query.getResultList();
	}

	@Override
	public Facture getById(Long pId) {
		Facture facture = em.find(Facture.class, pId);
		log.info("==== La facture " + pId + " à bien étée obtenue ====");
		return facture;
	}

}
