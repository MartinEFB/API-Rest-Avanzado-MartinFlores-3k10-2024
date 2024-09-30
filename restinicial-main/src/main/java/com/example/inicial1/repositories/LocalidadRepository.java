package com.example.inicial1.repositories;


import com.example.inicial1.entities.Localidad;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad, Long> {

    @Query("SELECT l FROM Localidad l WHERE l.denominacion LIKE %:filtro%") // Uso correcto del comodín con el parámetro
    List<Localidad> search(@Param("filtro") String filtro);

    @Query("SELECT l FROM Localidad l WHERE l.denominacion LIKE %:filtro%") // Query JPQL corregida
    Page<Localidad> search(@Param("filtro") String filtro, Pageable pageable);
}