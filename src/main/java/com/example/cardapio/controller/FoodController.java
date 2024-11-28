package com.example.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodResponseDTO;

@RestController
@RequestMapping
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @GetMapping
    public List<FoodResponseDTO> getAll() {

        List<FoodResponseDTO> foodlist = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodlist;

    }
}
