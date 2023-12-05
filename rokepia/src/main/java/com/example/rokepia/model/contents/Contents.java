package com.example.rokepia.model.contents;

import lombok.Data;

@Data
public class Contents {
	
	private Long id;
	private Long category_seq;
	private Long location_count;
	private Long view_count;
	private String title;
	private String info;
	private String image;

}
