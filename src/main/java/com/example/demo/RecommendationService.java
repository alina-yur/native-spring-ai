package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;

@Service
public class RecommendationService {

    private final ChatClient chatClient;

    public RecommendationService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public String getRecommendation(String country, String activity, String mood) {
        String message = """
                You are acting as a travel recommendation service.
                Provide a destination suggestion for a user based on their preferences. Please don't use markdown syntax.
                They prefer %s as the country, %s as the activity, and %s as the mood.
            """.formatted(country, activity, mood);
        PromptTemplate promptTemplate = new PromptTemplate(message);
        Prompt prompt = promptTemplate.create();
        return chatClient.call(prompt).getResult().getOutput().getContent();
    }
}