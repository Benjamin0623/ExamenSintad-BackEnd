package com.benjamin.prueba.repo;

import com.benjamin.prueba.model.Usuario;

public interface IUsuarioRepo extends IGenericRepo<Usuario, Integer>{

	Usuario findOneByUsername(String username);
}
