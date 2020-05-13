package com.example.demo.controllers;

import com.example.demo.models.Casinos;
import com.example.demo.services.ServiceCasino;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("casinos")
public class CasinoController {
    private ServiceCasino serviceCasino;


    public CasinoController(ServiceCasino casino)
    {
        this.serviceCasino = casino;
    }

    @PostMapping("/")
    public void save(@RequestBody Casinos casinos)
    {
        serviceCasino.Save(casinos);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Casinos casinos, @PathVariable long id)
    {
        serviceCasino.Update(casinos, id);
    }

    @GetMapping("/getCasinos")
    public Iterable<Casinos> getAllCasinos()
    {
        return serviceCasino.getAllCasinos();
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id)
    {
        serviceCasino.Delete(id);
    }

}