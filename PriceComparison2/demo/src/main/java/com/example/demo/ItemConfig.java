package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Configuration
public class ItemConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(ItemRepository itemRepository){
        return args -> {
               Item banana = new Item("banana",itemRepository.findPriceByName("banana").getPrice() ,itemRepository.findStoreByName("banana").getSources());
               banana.setPrice(banana.findCheapestItem(banana.getName()));
                Item apple = new Item("apple-fruit",itemRepository.findPriceByName("apple-fruit").getPrice(),itemRepository.findStoreByName("apple-fruit").getSources());
                apple.setPrice(apple.findCheapestItem(apple.getName()));
                Item grapes = new Item("grapes",itemRepository.findPriceByName("grapes").getPrice(),itemRepository.findStoreByName("grapes").getSources());
                grapes.setPrice(grapes.findCheapestItem(grapes.getName()));
                Item watermelon = new Item("watermelon",itemRepository.findPriceByName("watermelon").getPrice(),itemRepository.findStoreByName("watermelon").getSources());
                watermelon.setPrice(watermelon.findCheapestItem(watermelon.getName()));


            itemRepository.saveAll(List.of(apple,banana,grapes,watermelon));
        };
    }
}
