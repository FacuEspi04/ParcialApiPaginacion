package com.utn.apiRestEsp.services;

import com.utn.apiRestEsp.entities.Localidad;
import com.utn.apiRestEsp.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {

    public LocalidadServiceImpl(BaseRepository<Localidad,Long> baseRepository){
        super(baseRepository);
    }

}
