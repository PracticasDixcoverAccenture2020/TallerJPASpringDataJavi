package es.biblioteca.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.biblioteca.entity.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais,Integer> {
	
	@Query(value="select * from pais where nombre like %?1", nativeQuery = true)
	List<Pais> findByNombre(String nombre);
	
	public Optional<Pais> findByAutor_id(Integer id);
}
