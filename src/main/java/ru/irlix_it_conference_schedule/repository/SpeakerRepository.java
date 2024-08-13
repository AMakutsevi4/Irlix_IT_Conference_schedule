package ru.irlix_it_conference_schedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.irlix_it_conference_schedule.model.Speaker;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}