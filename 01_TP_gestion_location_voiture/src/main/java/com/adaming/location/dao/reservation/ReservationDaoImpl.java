package com.adaming.location.dao.reservation;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.adaming.location.entities.Reservation;

public class ReservationDaoImpl implements IReservationDao {

	private EntityManager em;
	
	Logger log = Logger.getLogger("ReservationDaoImpl");
	
	@Override
	public Reservation add(Reservation pObjet) {
		em.persist(pObjet);
		log.info("==== La réservation  " + pObjet.getIdReservation() + " à bien étée ajoutée ====");
		return pObjet;
	}

	@Override
	public Reservation update(Reservation pObjet) {
		em.merge(pObjet);
		log.info("==== La réservation " + pObjet.getIdReservation() + " à bien étée modifiée ====");
		return pObjet;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Reservation> getAll() {
		Query query = em.createQuery("from Reservation");
		log.info("==== La liste des réservations contient : " + query.getResultList().size() + " réservations ====");
		return query.getResultList();
	}

	@Override
	public Reservation getById(Long pId) {
		Reservation resa = em.find(Reservation.class, pId);
		log.info("==== La réservation : " + pId + " à bien étée trouvée ====");
		return resa;
	}

}
