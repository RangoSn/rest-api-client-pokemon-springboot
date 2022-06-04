package com.restclient.restclient.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restclient.restclient.entity.Abilities;
import com.restclient.restclient.entity.HeldItems;
import com.restclient.restclient.service.pokemonService;

@RestController
@RequestMapping("/ash-regio")
public class pokemonController {
    private pokemonService service;
    
    @Autowired
    public pokemonController(pokemonService service) {
        this.service = service;
    }

    @GetMapping("/abilities/{pokemon}")
    public List<Abilities> getPokemon(@PathVariable("pokemon") String pokemonName) {
        return service.getPokemonAbilities(pokemonName);
    }

    @GetMapping("/base-experience/{pokemon}")
    public Integer getPokemonBaseExperience(@PathVariable("pokemon") String pokemonName) {
        return service.getPokemonBaseExperience(pokemonName);
    }

    @GetMapping("/held-items/{pokemon}")
    public List<HeldItems> getPokemonHeldItems(@PathVariable("pokemon") String pokemonName) {
        return service.getPokemonHeldItems(pokemonName);
    }

    @GetMapping("/id/{pokemon}")
    public Integer getPokemonId(@PathVariable("pokemon") String pokemonName) {
        return service.getPokemonId(pokemonName);
    }

    @GetMapping("/name/{pokemon}")
    public String getPokemonName(@PathVariable("pokemon") String pokemonName) {
        return service.getPokemonName(pokemonName);
    }

    @GetMapping("/location-area-encounters/{pokemon}")
    public String getPokemonLocationArea(@PathVariable("pokemon") String pokemonName) {
        return service.getPokemonLocationArea(pokemonName);
    }

   
    

    
}
