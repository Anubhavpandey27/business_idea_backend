package com.matching.backend.repository;

import com.matching.backend.model.Matching;
import org.springframework.data.jpa.repository.JpaRepository;





public interface MatchingRepository extends JpaRepository<Matching, Long> {}
