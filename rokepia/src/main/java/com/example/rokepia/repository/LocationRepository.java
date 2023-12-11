package com.example.rokepia.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rokepia.Location;

@Mapper
//public interface LocationRepository extends JpaRepository<Location, Long> {
public interface LocationRepository {
	
	List<Location> findAll();
	
}
