package es.biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.biblioteca.entity.Pais;
import es.biblioteca.repository.PaisRepository;
import es.biblioteca.service.PaisService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PaisServiceImpl implements PaisService {
	
	@Autowired
	PaisRepository repoPais;

	@Override
	public List<Pais> findAll() {
		log.debug("Se obtienen todos los paises");
		return repoPais.findAll();
	}

	@Override
	public Pais findById(int id) {
		log.debug("Se obtiene un pais por el id "+id);
		return repoPais.getOne(id);
	}

	@Override
	public void deleteById(int id) {
		log.debug("Se borra un pais por el id "+id);
		repoPais.deleteById(id);
	}

	@Override
	public Pais newPais(Pais pais) {
		log.debug("Se crea un nuevo pais "+pais);
		return repoPais.save(pais);
	}
	
	
		
}
