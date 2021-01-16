package com.benjamin.prueba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_tipo_contribuyente")
public class Contribuyente {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_contribuyente",nullable = false)
	private Integer idTipoContribuyente;
	
	@Column(name = "nombre",length = 50, nullable = false)
	private String nombre;
	
	private boolean estado;

	public Integer getIdTipoContribuyente() {
		return idTipoContribuyente;
	}

	public void setIdTipoContribuyente(Integer idTipoContribuyente) {
		this.idTipoContribuyente = idTipoContribuyente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
