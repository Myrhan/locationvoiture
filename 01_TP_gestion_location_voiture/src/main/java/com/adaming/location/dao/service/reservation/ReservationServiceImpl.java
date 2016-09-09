package com.adaming.location.dao.service.reservation;

import java.util.List;
import java.util.logging.Logger;

import com.adaming.location.entities.Reservation;

public class ReservationServiceImpl implements IReservationService {

	Logger log = Logger.getLogger("ReservationServiceImpl");
	
	private IReservationService dao;
	
	public void setDao(IReservationService dao) {
		this.dao = dao;
		log.info("<------------ DAO RESERVATION INJECTE ------------>");
	}

	@Override
	public Reservation add(Reservation pObjet) {
		return dao.add(pObjet);
	}

	@Override
	public Reservation update(Reservation pObjet) {
		return dao.update(pObjet);
	}

	@Override
	public List<Reservation> getAll() {
		return dao.getAll();
	}

	@Override
	public Reservation getById(Long pId) {
		return dao.getById(pId);
	}

}
