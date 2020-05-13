package com.example.demo.controllers;

import com.example.demo.models.Clients;
import com.example.demo.services.ServicesClients;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clients")
public class ClientController {
    private ServicesClients cServicesClients;
	
	public ClientController(ServicesClients client) {
		this.cServicesClients = client;
	}
	
	@PostMapping("/")
    public void save(@RequestBody Clients client) {
		cServicesClients.Save(client);
    }
	
	@PutMapping("/{id}")
	public void update(@RequestBody Clients client, @PathVariable Long id) {
		cServicesClients.Update(client, id);
	}
	
	@GetMapping("/getClients")
    public Iterable<Clients> getAllClients() {
        return cServicesClients.getAllClients();
    }
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		cServicesClients.Delete(id);
	}
	
}