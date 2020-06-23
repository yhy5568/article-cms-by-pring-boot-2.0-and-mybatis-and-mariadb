package com.example.starter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.starter.dto.Article;

@Service
public class ArticleServiceImpl implements ArticleService{

	public List<Article> getList(){
		//이건 가짜 데이터. 중간확인용
		Article article1 = new Article(1, "2020-06-26 10:08:00", "제목1", "내용1");
		Article article2 = new Article(2, "2020-06-27 10:08:00", "제목2", "내용3");
		Article article3 = new Article(3, "2020-06-28 10:08:00", "제목2", "내용3");
		
		List<Article> list = new ArrayList<>();
		
		list.add(article1);
		list.add(article2);
		list.add(article3);
		
		return list;
	}
}
