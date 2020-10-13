package es.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.biblioteca.entity.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais,Integer> {

}
