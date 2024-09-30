package com.example.inicial1.services;

import com.example.inicial1.entities.Autor;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface AutorService extends BaseService<Autor, Long>{

    List<Autor> serch(String filtro) throws Exception;

    Page<Autor> serch(String filtro, Pageable pageable) throws Exception;
}
