package com.utn.apiRestEsp.controllers;

import com.utn.apiRestEsp.entities.Autor;
import com.utn.apiRestEsp.services.AutorServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Pageable;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {
    @Override
    public ResponseEntity<?> getAll(Pageable pageable) {
        return null;
    }
}
