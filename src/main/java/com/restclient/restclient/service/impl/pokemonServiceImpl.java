package com.restclient.restclient.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.restclient.restclient.entity.Abilities;
import com.restclient.restclient.entity.HeldItems;
import com.restclient.restclient.entity.PokemonItem;
import com.restclient.restclient.service.pokemonService;
@Service
public class pokemonServiceImpl implements pokemonService{
    
    private RestTemplate restTemplate;        
    
    @Autowired
    public pokemonServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public List<Abilities> getPokemonAbilities(String pokemonName) {
        String uri = "https://pokeapi.co/api/v2/pokemon/";
        ResponseEntity<PokemonItem> pokemon = restTemplate.exchange(uri+pokemonName, HttpMethod.GET, null, PokemonItem.class);
        return pokemon.getBody().getAbilities();
    }

    @Override
    public Integer getPokemonBaseExperience(String pokemonName) {
        String uri = "https://pokeapi.co/api/v2/pokemon/";
        ResponseEntity<PokemonItem> pokemon = restTemplate.exchange(uri+pokemonName, HttpMethod.GET, null, PokemonItem.class);
        return pokemon.getBody().getBase_experience();
    }

    @Override
    public List<HeldItems> getPokemonHeldItems(String pokemonName) {
        String uri = "https://pokeapi.co/api/v2/pokemon/";
        ResponseEntity<PokemonItem> pokemon = restTemplate.exchange(uri+pokemonName, HttpMethod.GET, null, PokemonItem.class);
        return pokemon.getBody().getHeld_items();
    }

    @Override
    public Integer getPokemonId(String pokemonName) {
        String uri = "https://pokeapi.co/api/v2/pokemon/";
        ResponseEntity<PokemonItem> pokemon = restTemplate.exchange(uri+pokemonName, HttpMethod.GET, null, PokemonItem.class);
        return pokemon.getBody().getId();
    }
    
    @Override
    public String getPokemonName(String pokemonName) {
        String uri = "https://pokeapi.co/api/v2/pokemon/";
        ResponseEntity<PokemonItem> pokemon = restTemplate.exchange(uri+pokemonName, HttpMethod.GET, null, PokemonItem.class);
        return pokemon.getBody().getName();
    }


    @Override
    public String getPokemonLocationArea(String pokemonName) {
        String uri = "https://pokeapi.co/api/v2/pokemon/";
        ResponseEntity<PokemonItem> pokemon = restTemplate.exchange(uri+pokemonName, HttpMethod.GET, null, PokemonItem.class);
        return pokemon.getBody().getLocation_area_encounters();
    }



    
}
