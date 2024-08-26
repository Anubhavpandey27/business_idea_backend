package com.matching.backend.repository;

import com.matching.backend.model.UserInput;
import com.matching.backend.repository.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInputRepository extends JpaRepository<UserInput, Long> {}