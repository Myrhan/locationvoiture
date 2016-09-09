package com.adaming.location.dao.client;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.location.entities.Client;

public class ClientDaoImpl implements IClientDao {

	@PersistenceContext
	private EntityManager em;
	
	Logger log = Logger.getLogger("ClientDaoImpl");
	
	@Override
	public Client add(Client pObjet) {
		em.persist(pObjet);
		log.info("==== Le Client " + pObjet.getIdClient() + " à bien été ajouté ====");
		return pObjet;
	}

	@Override
	public Client update(Client pObjet) {
		em.merge(pObjet);
		log.info("==== Le Client " + pObjet.getIdClient() + " a bien été modifié ====");
		return pObjet;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Client> getAll() {
		Query query = em.createQuery("from Client");
		log.info("==== La liste de Client contient : " + query.getResultList().size() + " clients ====");
		return query.getResultList();
	}

	@Override
	public Client getById(Long pId) {
		Client client = em.find(Client.class, pId);
		log.info("==== Le client : " + pId + " à bien été trouvé ====");
		return client;
	}

}
