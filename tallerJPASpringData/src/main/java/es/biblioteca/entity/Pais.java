package es.biblioteca.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pais {
	
	@Id
	private int id;
	
	@Column(name = "nombre", nullable = false, length = 150)
	private String nombre;
	
	@OneToMany(mappedBy="pais")
    private List<Autor> autor;
	
}
