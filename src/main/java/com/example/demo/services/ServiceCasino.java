package com.example.demo.services;

import java.util.Optional;

import com.example.demo.helpers.AlreadyExistRegister;
import com.example.demo.helpers.ModelNotFound;
import com.example.demo.models.Casinos;
import com.example.demo.repositories.RepositoryCasino;
import org.springframework.stereotype.Service;

@Service
public class ServiceCasino {
    private RepositoryCasino casino;


    public ServiceCasino(RepositoryCasino cli)
    {
        this.casino = cli;
    }

    public void Save(Casinos cas)
    {
        Optional<Casinos> idcasinos = casino.findById(cas.getIdCasino());
        if(idcasinos.isPresent())
        {
            throw new AlreadyExistRegister("El casino ya se encuentra registrado");
        }
        casino.save(cas);
    }


    public void Update(Casinos cli, long id)
    {
        Optional<Casinos> idcasinos = casino.findById(id);
        if(idcasinos.isPresent() == false )
        {
            throw new ModelNotFound("No se ha encontrado el casino");
        }
        casino.save(cli);
    }

    public Iterable<Casinos> getAllCasinos()
    {
        return casino.findAll();
    }

    public void Delete(Long id)
    {
        casino.deleteById(id);
    }
}