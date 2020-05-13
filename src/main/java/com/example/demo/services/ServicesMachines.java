package com.example.demo.services;

import java.util.Optional;

import com.example.demo.helpers.AlreadyExistRegister;
import com.example.demo.helpers.ModelNotFound;
import com.example.demo.models.Machines;
import com.example.demo.repositories.RepositoryMachines;

import org.springframework.stereotype.Service;

@Service
public class ServicesMachines {
    private RepositoryMachines machines;


    public ServicesMachines(RepositoryMachines rm)
    {
        this.machines = rm;
    }

    public void Save(Machines mach)
    {
        Optional<Machines> idmachine = machines.findById(mach.getIdMachine());

        if(idmachine.isPresent())
        {
            throw new AlreadyExistRegister("Esta maquina ya se encuentra registrada");
        }
        machines.save(mach);
    }

    public void Update(Machines mach, Long id)
    {
        Optional<Machines> idmachines = machines.findById(id);
        if(idmachines.isPresent() == false )
        {
            throw new ModelNotFound("No se encuentra el registro");
        }
        machines.save(mach);
    }

    public Iterable<Machines> getAllMachines()
    {
        return machines.findAll();
    }

    public void Delete(long id)
    {
        machines.deleteById(id);
    }
}