package com.adaming.location.dao.service.client;

import java.util.List;
import java.util.logging.Logger;

import com.adaming.location.entities.Client;

public class ClientServiceImpl implements IClientService {

	Logger log = Logger.getLogger("ClientServiceImpl");
	
	private IClientService dao;
	
	public void setDao(IClientService dao) {
		this.dao = dao;
		log.info("<------------ DAO CLIENT INJECTE ------------>");
	}

	@Override
	public Client add(Client pObjet) {
		return dao.add(pObjet);
	}

	@Override
	public Client update(Client pObjet) {
		return dao.update(pObjet);
	}

	@Override
	public List<Client> getAll() {
		return dao.getAll();
	}

	@Override
	public Client getById(Long pId) {
		return dao.getById(pId);
	}

}
