package com.benjamin.prueba;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.benjamin.prueba.model.Usuario;
import com.benjamin.prueba.repo.IUsuarioRepo;

@SpringBootTest
class PruebaApplicationTests {

	@Autowired
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Test
	void verificarClave() {
		Usuario us = new Usuario();
		us.setIdUsuario(1);
		us.setUsername("prueba@gmail.com");
		us.setPassword(bcrypt.encode("123"));
		us.setEnabled(true);
		
		Usuario retorno = repo.save(us);
		
		assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));
	}

}
 