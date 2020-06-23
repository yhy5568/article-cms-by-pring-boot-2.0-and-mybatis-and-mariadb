package com.example.starter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {

	public Article(int i, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	private long id;
	private String regDate;
	private String title;
	private String body;
}
