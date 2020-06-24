package com.example.starter.dto;

public class Article {

	public Article(int id2, String regDate2, String title2, String body2) {
		
		// TODO Auto-generated constructor stub
	}
	private long id;
	private String regDate;
	private String title;
	private String body;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
}
