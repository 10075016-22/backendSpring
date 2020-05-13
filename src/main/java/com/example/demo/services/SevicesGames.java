package com.example.demo.services;

import java.util.Optional;

import com.example.demo.helpers.AlreadyExistRegister;
import com.example.demo.models.Games;
import com.example.demo.repositories.RepositoryGames;

import org.springframework.stereotype.Service;

@Service
public class SevicesGames {
    private RepositoryGames games;

    public SevicesGames(RepositoryGames rg)
    {
        this.games =  rg;
    }

    public void Save(Games g)
    {
        Optional<Games> idgames = games.findById(g.getIdGame());
        if(idgames.isPresent())
        {
            throw new AlreadyExistRegister("El registro ya existe");
        }
        games.save(g);
    }

    public void Update(Games g, Long id)
    {
        Optional<Games> idgames = games.findById(id);
        if(idgames.isPresent() == false)
        {
            throw new AlreadyExistRegister("No se encuentra el registro");
        }
        games.save(g);
    }

    public Iterable<Games> getAllGames()
    {
        return games.findAll();
    }

    public void Delete(Long id)
    {
        games.deleteById(id);
    }
}