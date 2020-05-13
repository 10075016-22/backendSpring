package com.example.demo.controllers;

import com.example.demo.models.Games;
import com.example.demo.services.SevicesGames;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("games")
public class GamesController {
    private SevicesGames sevicesGames;
	
	public GamesController(SevicesGames game) {
		this.sevicesGames = game;
	}
	
	@PostMapping("/")
    public void save(@RequestBody Games game) {
		sevicesGames.Save(game);
    }
	
	@PutMapping("/{id}")
	public void update(@RequestBody Games game, @PathVariable Long id) {
		sevicesGames.Update(game, id);
	}
	@GetMapping("/getGames")
    public Iterable<Games> getAllGames() {
        return sevicesGames.getAllGames();
    }
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		sevicesGames.Delete(id);
	}
}