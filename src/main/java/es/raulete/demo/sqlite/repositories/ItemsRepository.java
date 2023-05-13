package es.raulete.demo.sqlite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.raulete.demo.sqlite.entities.Item;

@Repository("itemsRepository")
public interface ItemsRepository extends CrudRepository<Item,Integer>{
    
}
