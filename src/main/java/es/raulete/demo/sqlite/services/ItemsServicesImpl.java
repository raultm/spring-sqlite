package es.raulete.demo.sqlite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.raulete.demo.sqlite.entities.Item;
import es.raulete.demo.sqlite.repositories.ItemsRepository;

@Service("itemsService")
public class ItemsServicesImpl implements ItemsService{

    @Autowired
    private ItemsRepository itemsRepository;

    @Override
    public Iterable<Item> findAll() {
        return itemsRepository.findAll();
    }
    
}
