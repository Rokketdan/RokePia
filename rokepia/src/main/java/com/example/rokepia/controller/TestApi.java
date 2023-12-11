package com.example.rokepia.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rokepia.model.Location;
import com.example.rokepia.repository.TestMapper;
import com.example.rokepia.repository.TestMapper2;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.example.rokepia.model.Contents;


@RestController
@RequiredArgsConstructor
@Slf4j
public class TestApi {
	
	private final TestMapper test1;
	private final TestMapper2 test2;
	
	
	@GetMapping("humuhumu")
	public ResponseEntity<List<Location>> responseBodyV3(@RequestParam("contentsId") String contentsId){
		List<Location> data = new ArrayList();
		log.info("이거 들어감:{}",contentsId);
		data = test1.testSelectById(Long.parseLong(contentsId));
		
		
		return new ResponseEntity<List<Location>>(data,HttpStatus.CREATED);
	}
}
