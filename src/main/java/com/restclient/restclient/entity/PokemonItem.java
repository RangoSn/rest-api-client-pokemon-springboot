package com.restclient.restclient.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class PokemonItem {    
    private int base_experience;  
    private int height;
    private int id;
    private String location_area_encounters;
    private String name;
    private int weight; 
    private List<Abilities> abilities;   
    private List<HeldItems> held_items;   

    public List<HeldItems> getHeld_items() {
        return held_items;
    }
    public void setHeld_items(List<HeldItems> held_items) {
        this.held_items = held_items;
    }
    public List<Abilities> getAbilities() {
        return abilities;
    }
    public void setAbilities(List<Abilities> abilities) {
        this.abilities = abilities;
    }
    
    
    public int getBase_experience() {
        return base_experience;
    }
    public void setBase_experience(int base_experience) {
        this.base_experience = base_experience;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLocation_area_encounters() {
        return location_area_encounters;
    }
    public void setLocation_area_encounters(String location_area_encounters) {
        this.location_area_encounters = location_area_encounters;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    
   }
