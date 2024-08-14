package ru.irlix_it_conference_schedule.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.irlix_it_conference_schedule.dto.ReportDTO;
import ru.irlix_it_conference_schedule.model.Report;
import ru.irlix_it_conference_schedule.service.ReportService;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
@RequiredArgsConstructor
@Tag(name="Доклад", description="Данный контроллер содержит CRUD операции с сущностью доклад")
public class ReportController {

    private final ReportService reportService;

    @GetMapping
    public List<ReportDTO> getAll() {
        return reportService.findAll();
    }

    @GetMapping("/{id}")
    public ReportDTO getById(@PathVariable Long id) {
        return reportService.findById(id);
    }

    @GetMapping("/auditorium/{auditorium_Id}")
    public List<Report> getReportsByAuditorium(@PathVariable Long auditorium_Id) {
        return reportService.findByAuditoriumId(auditorium_Id);
    }

    @PostMapping
    public ReportDTO create(@RequestBody Report report) {
        return reportService.save(report);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        reportService.delete(id);
    }
}
