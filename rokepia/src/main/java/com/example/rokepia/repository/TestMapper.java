package com.example.rokepia.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.rokepia.model.LocationTest;

@Mapper
public interface TestMapper {
	List<LocationTest> testAllSelect(); 
	LocationTest testOneSelect(Long LocationId); 
}
