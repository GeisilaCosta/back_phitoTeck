package com.phitoTec_backEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.phitoTec_backEnd.entity.Plant;
import com.phitoTec_backEnd.repository.PlantRepository;

import java.util.List;

@RestController
@RequestMapping("/plants")
public class PlantController {

    @Autowired
    private PlantRepository plantRepository;

    @GetMapping
    public List<Plant> getAllPlants() {
        return plantRepository.findAll();
    }

   
    @PostMapping
    public Plant createPlant(@RequestBody Plant plant) {
        return plantRepository.save(plant);
    }

    @GetMapping("/search")
    public List<Plant> getPlantsByIndication(@RequestParam String indication) {
        return plantRepository.findByIndication(indication);
    }
}
