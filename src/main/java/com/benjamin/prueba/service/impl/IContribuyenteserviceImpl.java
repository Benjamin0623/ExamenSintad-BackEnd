package com.benjamin.prueba.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benjamin.prueba.model.Contribuyente;
import com.benjamin.prueba.repo.IContribuyenteRepo;
import com.benjamin.prueba.repo.IGenericRepo;
import com.benjamin.prueba.service.IContribuyenteService;

@Service
public class IContribuyenteserviceImpl extends ICRUDImpl<Contribuyente, Integer> implements IContribuyenteService {

	@Autowired
	private IContribuyenteRepo repo;

	@Override
	protected IGenericRepo<Contribuyente, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	
	
}
