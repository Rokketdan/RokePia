package com.example.rokepia.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rokepia.Location;
import com.example.rokepia.repository.LocationRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@RestController
@Slf4j
public class TestController {
	
	/*
	 * private final LocationRepository locationRepository;
	 * 
	 * @GetMapping("test") public ResponseEntity<List<Location>> showMap(Model
	 * model) { log.info("locations 처음:"); List<Location> locations =
	 * locationRepository.findAll(); model.addAttribute("locations", locations);
	 * log.info("locations: 마지막 {}", locations); return new
	 * ResponseEntity<List<Location>>(locations, HttpStatus.CREATED); }
	 */

}
