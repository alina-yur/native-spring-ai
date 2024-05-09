package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RecommendationController {

    @Autowired
    private RecommendationService recommendationService;

    @GetMapping("/")
    public String form(Model model) {
        return "form";
    }

    @PostMapping("/recommend")
    public String recommend(@RequestParam String country, @RequestParam String activity, @RequestParam String mood, Model model) {
        String recommendation = recommendationService.getRecommendation(country, activity, mood);
        System.out.println(recommendation);
        model.addAttribute("recommendation", recommendation);
        return "result";
    }

}