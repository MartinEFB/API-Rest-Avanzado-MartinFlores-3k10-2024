package com.example.inicial1.services;

import com.example.inicial1.entities.Persona;
import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long> {

    List<Persona> serch(String filtro) throws Exception;

    Page<Persona> serch(String filtro, Pageable pageable) throws Exception;

}
