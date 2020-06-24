package com.example.starter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.starter.dao.ArticleDao;
import com.example.starter.dto.Article;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	ArticleDao articleDao;
	public List<Article> getList() {
		return articleDao.getList();
		
	}
	@Override
	public void add(Map<String, Object> param) {
		articleDao.add(param);
		
	}
}