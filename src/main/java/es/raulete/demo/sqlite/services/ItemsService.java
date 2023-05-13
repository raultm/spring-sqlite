package es.raulete.demo.sqlite.services;

import es.raulete.demo.sqlite.entities.Item;

public interface ItemsService {
    
    public Iterable<Item> findAll();
}
