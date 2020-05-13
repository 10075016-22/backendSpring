package com.example.demo.services;

import java.util.Optional;

import com.example.demo.helpers.AlreadyExistRegister;
import com.example.demo.helpers.ModelNotFound;
import com.example.demo.models.Clients;
import com.example.demo.repositories.RepositoryClients;

import org.springframework.stereotype.Service;

@Service
public class ServicesClients {
    private RepositoryClients clients;

    public ServicesClients(RepositoryClients client)
    {
        this.clients = client;
    }

    
    public void Save(Clients cli)
    {
        Optional<Clients> idclients = clients.findById(cli.getIdClient());

        if(idclients.isPresent())
        {
            throw new AlreadyExistRegister("Este registro ya existe");
        }
        clients.save(cli);
    }

    public void Update(Clients cli, Long id)
    {
        Optional<Clients> idclients = clients.findById(id);
        if(idclients.isPresent() == false)
        {
            throw new ModelNotFound("No se ha encontrado el casino");
        }
        clients.save(cli);
    }

    public Iterable<Clients> getAllClients(){
        return clients.findAll();
    }

    public void Delete(long id)
    {
        clients.deleteById(id);
    }
}