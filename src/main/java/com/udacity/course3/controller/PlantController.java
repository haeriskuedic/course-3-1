package com.udacity.course3.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.udacity.course3.data.Plant;
import com.udacity.course3.data.PlantDTO;
import com.udacity.course3.data.Views;
import com.udacity.course3.service.PlantService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plant")
public class PlantController {

    @Autowired
    private PlantService plantService;

    /**
     * We want to make a REST endpoint that allows users to retrieve the price for a plant with a specific name,
     * but we don’t want to show them ids or any information about the Delivery that plant is scheduled for.
     * For this assignment, we’ll solve the problem twice:
         * once using a DTO and
         * once using the @JSONView annotation.
     */
    /** DTO Variante */
    public PlantDTO getPlantDTO(String name) {
        return convertPlantToPlantDTO(plantService.getPlantByName(name));
    }

    private PlantDTO convertPlantToPlantDTO(Plant plant) {
        PlantDTO plantDTO = new PlantDTO();
        BeanUtils.copyProperties(plant, plantDTO);
        return plantDTO;
    }

    /** JsonView Variante */
    @JsonView(Views.Public.class)
    public Plant getFilteredPlant(String name) {
        return plantService.getPlantByName(name);
    }
}
