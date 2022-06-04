package com.restclient.restclient.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Version_details {
    private int rarity;
    Version version;

    public int getRarity() {
        return rarity;
    }
    public void setRarity(int rarity) {
        this.rarity = rarity;
    }
    public Version getVersion() {
        return version;
    }
    public void setVersion(Version version) {
        this.version = version;
    }
    
}
