package com.benjamin.prueba.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benjamin.prueba.model.Documento;
import com.benjamin.prueba.repo.IDocumentoRepo;
import com.benjamin.prueba.repo.IGenericRepo;
import com.benjamin.prueba.service.IDocumentoService;

@Service
public class IDocumentoServiceImpl extends ICRUDImpl<Documento, Integer> implements IDocumentoService {

	@Autowired
	private IDocumentoRepo repo;

	@Override
	protected IGenericRepo<Documento, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	
	
}
