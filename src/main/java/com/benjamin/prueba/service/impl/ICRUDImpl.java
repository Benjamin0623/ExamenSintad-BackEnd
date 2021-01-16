package com.benjamin.prueba.service.impl;

import java.util.List;

import com.benjamin.prueba.repo.IGenericRepo;
import com.benjamin.prueba.service.ICRUD;

public abstract class ICRUDImpl<T,ID> implements ICRUD<T, ID> {

	protected abstract IGenericRepo<T, ID> getRepo();
	
	
	public T registrar(T obj) throws Exception {
		return getRepo().save(obj);
	}


	public T modificar(T obj) throws Exception {
		return getRepo().save(obj);
	}


	public List<T> listar() throws Exception {
		return getRepo().findAll();
	}
	

	public T listarPorId(ID id) throws Exception {
		return getRepo().findById(id).orElse(null);		
	}

	public void eliminar(ID id) throws Exception {
		getRepo().deleteById(id);
	}
}
