package com.helpinghands.backendPrototype.Data;

import com.helpinghands.backendPrototype.Models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {

    Iterable<Item> findByName(String name);
}
