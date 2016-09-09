package com.adaming.location.dao.service.voiture;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.location.dao.voiture.IVoitureDao;
import com.adaming.location.entities.Voiture;

@Transactional
public class VoitureServiceImpl implements IVoitureService {

	Logger log = Logger.getLogger("VoitureServiceImpl");
	
	private IVoitureDao dao;

	
	public void setDao(IVoitureDao dao) {
		this.dao = dao;
		log.info("<------------ DAO VOITURE INJECTE ------------>");
	}

	@Override
	public Voiture add(Voiture pObjet) {
		return dao.add(pObjet);
	}

	@Override
	public Voiture update(Voiture pObjet) {
		return dao.update(pObjet);
	}

	@Override
	public List<Voiture> getAll() {
		return dao.getAll();
	}

	@Override
	public Voiture getById(Long pId) {
		return dao.getById(pId);
	}

}
