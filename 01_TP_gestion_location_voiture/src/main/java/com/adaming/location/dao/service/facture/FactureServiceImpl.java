package com.adaming.location.dao.service.facture;

import java.util.List;
import java.util.logging.Logger;

import com.adaming.location.dao.facture.IFactureDao;
import com.adaming.location.entities.Facture;

public class FactureServiceImpl implements IFactureService {

	Logger log = Logger.getLogger("FactureServiceImpl");
	
	private IFactureDao dao;
	
	public void setDao(IFactureDao dao) {
		this.dao = dao;
		log.info("<------------ DAO FACTURE INJECTE ------------>");
	}

	@Override
	public Facture add(Facture pObjet) {
		return dao.add(pObjet);
	}

	@Override
	public Facture update(Facture pObjet) {
		return dao.update(pObjet);
	}

	@Override
	public List<Facture> getAll() {
		return dao.getAll();
	}

	@Override
	public Facture getById(Long pId) {
		return dao.getById(pId);
	}

}
