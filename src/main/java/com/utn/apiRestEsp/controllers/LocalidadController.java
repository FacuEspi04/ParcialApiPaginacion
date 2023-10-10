package com.utn.apiRestEsp.controllers;

import com.utn.apiRestEsp.entities.Localidad;
import com.utn.apiRestEsp.services.LocalidadServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{

}
