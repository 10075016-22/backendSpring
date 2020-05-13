package com.example.demo.repositories;

import com.example.demo.models.Games;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryGames extends CrudRepository <Games, Long>{
    
}