package com.matching.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
@Setter
public class UserInput {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String idea;
    private String status; // "Exploring" or "Business Idea"
    private String businessType; // "B2C" or "B2B"
    private String expertise; // "Tech", "Marketing", "Money"


}
