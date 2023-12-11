package com.example.rokepia.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

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
	
	private final TestMapper test1; // 로케이션
	private final TestMapper2 test2; // 콘텐츠
	
	
	@GetMapping("humuhumu")
	public ResponseEntity<Map<String, Object>> responseBodyV3(@RequestParam("contentsId") String contentsId) {
	    Map<String, Object> response = new HashMap<>();
	    List<Location> locations = new ArrayList<>();
	    Contents content = null;
	    
	    log.info("이거 들어감:{}", contentsId);
	    
	    // 리스트 타입 반환
	    locations = test1.testSelectById(Long.parseLong(contentsId));
	    content = test2.test2OneSelect(Long.parseLong(contentsId));
	    
	    response.put("location", locations);
	    response.put("content", content); // 예시로 추가된 값
	    
	    return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
}
