package com.adaming.location.dao.voiture;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.location.entities.Voiture;

public class VoitureDaoImpl implements IVoitureDao {

	@PersistenceContext
	private EntityManager em;
	
	Logger log = Logger.getLogger("VoitureDaoImpl");
	
	@Override
	public Voiture add(Voiture pObjet) {
		em.persist(pObjet);
		log.info("==== La voiture " + pObjet.getIdVoiture() + " à bien étée ajoutée ====");
		return pObjet;
	}

	@Override
	public Voiture update(Voiture pObjet) {
		em.merge(pObjet);
		log.info("==== La voiture " + pObjet.getIdVoiture() + " à bien étée modifiée ====");
		return pObjet;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Voiture> getAll() {
		Query query = em.createQuery("from Voiture");
		log.info("==== La liste des voitures contient : " + query.getResultList() + " voitures ====");
		return query.getResultList();
	}

	@Override
	public Voiture getById(Long pId) {
		Voiture voiture = em.find(Voiture.class, pId);
		log.info("==== La Voiture " + pId + " à bien été trouvée ====");
		return voiture;
	}

}
