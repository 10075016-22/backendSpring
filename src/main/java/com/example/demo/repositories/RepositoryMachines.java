package com.example.demo.repositories;

import com.example.demo.models.Machines;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryMachines extends CrudRepository<Machines, Long>{
    
}