package com.aravind.ailandscape.controller;

import com.aravind.ailandscape.model.NewsItem;
import com.aravind.ailandscape.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/news")
    public String news(Model model) {
        model.addAttribute("newsItems", newsService.getLatestNews());
        return "news";
    }
}