package es.biblioteca.service;

import java.util.List;

import es.biblioteca.entity.Pais;

public interface PaisService {
	
	public List<Pais> findAll();
	
	public Pais findById(int id);
	
	public void deleteById(int id);
	
	public Pais newPais(Pais pais);

}
