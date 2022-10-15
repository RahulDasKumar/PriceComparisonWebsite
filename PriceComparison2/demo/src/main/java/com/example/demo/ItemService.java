package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemService {
    private final ItemRepository itemRepository;
    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    //@GetMapping
    public List<Item> getItem(){
        return
               // new Item("bannana",9,"walmart");
                itemRepository.findAll();

    }
    public double findPrice(String name){
       return itemRepository.findPriceByName(name).getPrice();
    }
    public String findSource(String name){
        return itemRepository.findStoreByName(name).getSources();
    }
}
// new Item("bannana",9,"walmart");