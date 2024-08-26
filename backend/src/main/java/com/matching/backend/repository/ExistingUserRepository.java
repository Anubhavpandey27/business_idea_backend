package com.matching.backend.repository;

import com.matching.backend.model.ExistingUser;
import com.matching.backend.model.Matching;
import com.matching.backend.model.UserInput;
import com.matching.backend.repository.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExistingUserRepository extends JpaRepository<UserInput, Long> {

}