package es.biblioteca.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.junit5.api.DBRider;


@DataJpaTest
@DBRider
@DisplayName("Pruebas Paises")
public class PaisRepositoryTest {
	
	@Autowired
	PaisRepository repo;
	
	@Test
	@DataSet(value="paises.yml",cleanBefore = true, cleanAfter = true)
	@DisplayName("Prueba")
	public void testCount() {
		//List<Pais> paises = repo.findAll();
		//assertEquals(paises.size(),3);
		
		Long paises = repo.count();

		assertEquals(paises, 3);
	}

}
