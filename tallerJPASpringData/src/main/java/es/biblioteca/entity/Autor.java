package es.biblioteca.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Juan Manuel Cintas
 *
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Autor {

    /**
     * Id.
     */
    @Id
    private int id;

    /**
     * Nombre del autor.
     */
    private String nombre;

    /**
     * Libros.
     */
    @ManyToMany(mappedBy = "autores")
    List<Libro> libros;
    
    /**
     * Paises
     */
    //@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //private Pais pais;
}
