package es.biblioteca.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.junit5.api.DBRider;

import es.biblioteca.entity.Pais;


@DataJpaTest
@DBRider
@DisplayName("Pruebas Paises")
public class PaisRepositoryTest {
	
	@Autowired
	PaisRepository repoPais;
	
	@Test
	@DataSet(value="paises.yml",cleanBefore = true, cleanAfter = true)
	@DisplayName("Prueba total paises")
	public void testCount() {
		//List<Pais> paises = repo.findAll();
		//assertEquals(paises.size(),3);
		
		Long paises = repoPais.count();

		assertEquals(paises, 9);
	}
	
	@Test
	@DataSet(value = "paises.yml,autores.yml", cleanBefore = true, cleanAfter = true)
	@DisplayName("Buscar por id")
	public void testFindId() {
		
		Optional <Pais> pais = repoPais.findById(5);
		assertEquals(pais.isPresent(), true);
		assertEquals(pais.get().getAutor().size(),2);
		
	}

}
