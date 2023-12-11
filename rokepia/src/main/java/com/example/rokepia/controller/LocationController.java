package com.example.rokepia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.rokepia.Location;
import com.example.rokepia.repository.LocationRepository;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Controller
@Slf4j
public class LocationController {

    private final LocationRepository locationRepository;

    public LocationController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @GetMapping("anime")
    public String showMap(Model model) {
        List<Location> locations = locationRepository.findAll();
        model.addAttribute("locations", locations);
        log.info("locations: {}", locations);
        return "anime-details";
    }

}
