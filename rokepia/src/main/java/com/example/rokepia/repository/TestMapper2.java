package com.example.rokepia.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.rokepia.model.Contents;


@Mapper
public interface TestMapper2 {
	List<Contents> test2AllSelect(); 
	Contents test2OneSelect(Long ContentsId); 
}
