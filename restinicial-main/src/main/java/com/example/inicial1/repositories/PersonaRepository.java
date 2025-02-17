package com.example.inicial1.repositories;

import com.example.inicial1.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;

import java.util.List;


@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido); //Metodo

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%") //Query JPQL
    List<Persona> search(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%") //Query JPQL
    Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);


    /*@Query(value = "SELECT * FROM personta WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE%:filtro%d", //Query Nativo
            nativeQuery = true
    )
    List<Persona> searchnativo(@Param("filtro") String filtro);*/

}