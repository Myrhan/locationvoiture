package com.adaming.location.dao.service;

import java.util.List;

public interface IServiceGeneric <T> {

	public T add(T pObjet);
	
	public T update(T pObjet);
	
	public List<T> getAll();
	
	public T getById(Long pId);
}
