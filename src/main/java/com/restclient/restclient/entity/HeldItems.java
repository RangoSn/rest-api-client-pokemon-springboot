package com.restclient.restclient.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class HeldItems {
    Item item;
    List<Version_details> version_details;
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public List<Version_details> getVersion_details() {
        return version_details;
    }
    public void setVersion_details(List<Version_details> version_details) {
        this.version_details = version_details;
    }


    
}
