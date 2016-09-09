package com.adaming.location.dao;

import java.util.List;

public interface IDaoGeneric <E> {

	public E add(E pObjet);
	
	public E update(E pObjet);
	
	public List<E> getAll();
	
	public E getById(Long pId);
}
