package com.example.rokepia.model;
import lombok.Data;

@Data
public class Contents {
	Long contents_id;
	Long category_id;
	Long location_count;
	Long view_count;
	String title;
	String info;
	String image;
}
