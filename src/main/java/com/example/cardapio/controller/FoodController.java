package com.example.cardapio.controller;

import java.util.List;
import com.example.cardapio.controller.Food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @GetMapping
    public List<Food> getAll() {

        List<Food> foodlist = repository.findAll();
        return foodlist;

    }
}
