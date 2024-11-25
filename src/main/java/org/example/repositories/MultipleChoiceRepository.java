package org.example.repositories;

import org.example.models.MultipleChoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MultipleChoiceRepository extends JpaRepository<MultipleChoice, Integer> {
    // Add custom queries if needed
}
