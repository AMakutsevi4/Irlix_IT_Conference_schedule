package ru.irlix_it_conference_schedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.irlix_it_conference_schedule.model.Report;

import java.util.List;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {
    List<Report> findByAuditorium_Id(Long auditorium_Id);
}
