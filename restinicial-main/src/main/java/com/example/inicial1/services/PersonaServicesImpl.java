package com.example.inicial1.services;

import com.example.inicial1.entities.Persona;
import com.example.inicial1.repositories.BaseRepository;
import com.example.inicial1.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public class PersonaServicesImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServicesImpl(BaseRepository<Persona, Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Persona> serch(String filtro) throws Exception {
        try {

            List<Persona> personas = personaRepository.search(filtro); //Query (JPQL)
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        }



    @Override
    public Page<Persona> serch(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Persona> personas = personaRepository.search(filtro, pageable);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    }

