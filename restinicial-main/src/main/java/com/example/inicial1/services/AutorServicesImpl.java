package com.example.inicial1.services;

import com.example.inicial1.entities.Autor;

import com.example.inicial1.entities.Localidad;
import com.example.inicial1.repositories.AutorRepository;
import com.example.inicial1.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import java.util.List;

@Service
public class AutorServicesImpl extends BaseServiceImpl<Autor, Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;
    public AutorServicesImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Autor> serch(String filtro) throws Exception {
        try {
            List<Autor> autores = autorRepository.search(filtro);//Query (JPQL)
            return autores;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Autor> serch(String filtro, Pageable pageable) throws Exception {
            try {
                Page<Autor> autores = autorRepository.search(filtro, pageable); //Query (JPQL)
                return autores;
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        }




}