package com.matching.backend.service;


import com.matching.backend.model.ExistingUser;
import com.matching.backend.model.Matching;
import com.matching.backend.model.UserInput;
import com.matching.backend.repository.ExistingUserRepository;
import com.matching.backend.repository.MatchingRepository;
import com.matching.backend.repository.UserInputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class MatchingService {

    @Autowired
    private UserInputRepository userInputRepository;

    @Autowired
    private ExistingUserRepository existingUserRepository;

    @Autowired
    private MatchingRepository matchingRepository;

    public void processUserInput(UserInput userInput) {
        // Save the new user input
        userInputRepository.save(userInput);

        // Find matching existing users based on businessType and domainExpertise
        List<UserInput> matchingUsers = existingUserRepository.findAll().stream()
                .filter(user -> user.getBusinessType().equalsIgnoreCase(userInput.getBusinessType()))
                .filter(user -> user.getExpertise().equalsIgnoreCase(userInput.getExpertise()))
                .toList();

        // Save the matches in the matching table
        for (UserInput matchedUser : matchingUsers) {
            Matching match = new Matching();
            match.setUserInputId(userInput.getId());
            match.setExistingUserId(matchedUser.getId());
            matchingRepository.save(match);
        }
    }
}
