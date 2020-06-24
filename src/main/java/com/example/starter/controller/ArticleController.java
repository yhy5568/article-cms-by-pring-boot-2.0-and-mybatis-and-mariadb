package com.example.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.starter.dto.Article;
import com.example.starter.service.ArticleService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ArticleController {
	
	@Autowired
	ArticleService articleService;
	
	
	@RequestMapping("/article/list")
	public String showList(Model aModel) {
		List<Article> list = articleService.getList();
		
		aModel.addAttribute("list", list);
		
		return "article/list";
	}
	
	@RequestMapping("/article/add")
	public String showAdd() {
		
		return "article/add";
	}
}
