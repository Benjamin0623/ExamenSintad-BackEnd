package com.benjamin.prueba.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benjamin.prueba.model.Entidad;
import com.benjamin.prueba.repo.IEntidadRepo;
import com.benjamin.prueba.repo.IGenericRepo;
import com.benjamin.prueba.service.IEntidadService;

@Service
public class IEntidadServiceImpl extends ICRUDImpl<Entidad, Integer> implements IEntidadService {

	@Autowired
	private IEntidadRepo repo;

	@Override
	protected IGenericRepo<Entidad, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	
	
}
