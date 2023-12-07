package com.example.rokepia.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.rokepia.model.Location;

@Mapper
public interface LocationMapper {
	List<Location> testAllSelect(); 
	Location testOneSelect(Long LocationId); 
}
