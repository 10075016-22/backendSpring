package com.example.demo.repositories;

import com.example.demo.models.Casinos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCasino extends CrudRepository<Casinos, Long> {
    
}