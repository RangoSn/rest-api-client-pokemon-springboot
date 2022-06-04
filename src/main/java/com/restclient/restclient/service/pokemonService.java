package com.restclient.restclient.service;

import java.util.List;

import com.restclient.restclient.entity.Abilities;
import com.restclient.restclient.entity.HeldItems;

public interface pokemonService {
    List<Abilities> getPokemonAbilities(String pokemonName);
    Integer getPokemonBaseExperience(String pokemonName);
    List<HeldItems> getPokemonHeldItems(String pokemonName);
    Integer getPokemonId(String pokemonName);
    String getPokemonName(String pokemonName);
    String getPokemonLocationArea(String pokemonName);
    
    

}
