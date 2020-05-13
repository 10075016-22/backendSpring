package com.example.demo.repositories;

import com.example.demo.models.Clients;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryClients extends CrudRepository<Clients, Long> {
    
}