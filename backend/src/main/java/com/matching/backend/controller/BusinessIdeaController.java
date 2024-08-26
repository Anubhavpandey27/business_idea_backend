package com.example.businessidea.controller;


import com.matching.backend.model.UserInput;
import com.matching.backend.service.MatchingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/business")
public class BusinessIdeaController {

    @Autowired
    private MatchingService matchingService;

    @PostMapping("/submit")
    public String submitBusinessIdea(@RequestBody UserInput userInput) {
        matchingService.processUserInput(userInput);
        return "Business Idea Submitted and Matching Done!";
    }
}
