package com.adaming.location.dao.service.agence;

import java.util.List;
import java.util.logging.Logger;

import com.adaming.location.dao.agence.IAgenceDao;
import com.adaming.location.entities.Agence;

public class AgenceServiceImpl implements IAgenceService {

	Logger log = Logger.getLogger("AgenceServiceImpl");
	
	private IAgenceDao dao;
	
	
	public void setDao(IAgenceDao dao) {
		this.dao = dao;
		log.info("<------------ DAO AGENCE INJECTE ------------>");
	}

	@Override
	public Agence add(Agence pObjet) {
		return dao.add(pObjet);
	}

	@Override
	public Agence update(Agence pObjet) {
		return dao.update(pObjet);
	}

	@Override
	public List<Agence> getAll() {
		return dao.getAll();
	}

	@Override
	public Agence getById(Long pId) {
		return dao.getById(pId);
	}

}
