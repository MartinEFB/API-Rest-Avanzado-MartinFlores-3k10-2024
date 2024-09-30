package com.example.inicial1.repositories;
import com.example.inicial1.entities.Autor;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {

    @Query(value = "SELECT a FROM Autor a WHERE a.nombre LIKE %:filtro% OR a.apellido LIKE %:filtro%") // Consulta JPQL corregida
    List<Autor> search(@Param("filtro") String filtro);

    @Query(value = "SELECT a FROM Autor a WHERE a.nombre LIKE %:filtro% OR a.apellido LIKE %:filtro%") // Consulta JPQL corregida
    Page<Autor> search(@Param("filtro") String filtro, Pageable pageable);
}