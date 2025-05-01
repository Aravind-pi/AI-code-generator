package com.aravind.ailandscape.service;

import com.aravind.ailandscape.model.NewsItem;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class NewsService {

    public List<NewsItem> getLatestNews() {
        List<NewsItem> news = new ArrayList<>();
        news.add(new NewsItem(
            "GPT-4 Sets New Benchmarks",
            "Latest GPT-4 model demonstrates unprecedented capabilities in reasoning and problem-solving",
            LocalDate.now(),
            "AI Research Weekly"
        ));
        news.add(new NewsItem(
            "AI in Healthcare Breakthrough",
            "New AI system achieves 99% accuracy in early disease detection",
            LocalDate.now().minusDays(1),
            "Health Tech Today"
        ));
        news.add(new NewsItem(
            "Quantum AI Integration",
            "First successful integration of quantum computing with AI algorithms",
            LocalDate.now().minusDays(2),
            "Tech Frontier"
        ));
        return news;
    }
}