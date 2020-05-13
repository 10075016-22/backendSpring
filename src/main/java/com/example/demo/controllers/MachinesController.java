package com.example.demo.controllers;

import com.example.demo.models.Machines;
import com.example.demo.services.ServicesMachines;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("machines")
public class MachinesController {
    private final ServicesMachines servicesMachines;
	
	public MachinesController (ServicesMachines machine) {
		this.servicesMachines = machine;
	}
	
	@PostMapping("/")
    public void save(@RequestBody Machines machine) {
		servicesMachines.Save(machine);
    }
	
	@PutMapping("/{id}")
	public void update(@RequestBody Machines machine, @PathVariable Long id) {
		servicesMachines.Update(machine, id);
	}
	
	@GetMapping("/getMachines")
    public Iterable<Machines> getAllMachines() {
        return servicesMachines.getAllMachines();
    }
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		servicesMachines.Delete(id);
	}
	
}