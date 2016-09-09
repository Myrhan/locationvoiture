package com.adaming.location.dao.agence;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.location.entities.Agence;

public class AgenceDaoImpl implements IAgenceDao {

	@PersistenceContext
	private EntityManager em;
	
	Logger log = Logger.getLogger("AgenceDaoImpl");
	
	@Override
	public Agence add(Agence pObjet) {
		em.persist(pObjet);
		log.info("==== l'agence " + pObjet.getIdAgence() + " à bien étée ajoutée ====");
		return pObjet;
	}

	@Override
	public Agence update(Agence pObjet) {
		em.merge(pObjet);
		log.info("==== l'agence " + pObjet.getIdAgence() + " à bien étée ajoutée ====");
		return pObjet;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Agence> getAll() {
		Query query = em.createQuery("from Agence");
		log.info("==== la liste des agences contient : " + query.getResultList().size() + " agences ====");
		return query.getResultList();
	}

	@Override
	public Agence getById(Long pId) {
		Agence agence = em.find(Agence.class, pId);
		log.info("==== l'agence " + pId + " à bien étée trouvée ====");
		return agence;
	}

}
