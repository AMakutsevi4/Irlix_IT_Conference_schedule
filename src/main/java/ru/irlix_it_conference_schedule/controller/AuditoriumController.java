package ru.irlix_it_conference_schedule.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.irlix_it_conference_schedule.dto.AuditoriumDTO;
import ru.irlix_it_conference_schedule.model.Auditorium;
import ru.irlix_it_conference_schedule.service.AuditoriumService;

import java.util.List;

@RestController
@RequestMapping("/api/auditoriums")
@RequiredArgsConstructor
@Tag(name="Аудитория", description="Данный контроллер содержит CRUD операции с сущностью аудитория")
public class AuditoriumController {

    private final AuditoriumService auditoriumService;

    @GetMapping
    public List<AuditoriumDTO> getAll() {
        return auditoriumService.findAll();
    }

    @GetMapping("/{id}")
    public AuditoriumDTO getById(@PathVariable Long id) {
        return auditoriumService.findById(id);
    }

    @PostMapping
    public AuditoriumDTO create(@RequestBody Auditorium auditorium) {
        return auditoriumService.save(auditorium);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        auditoriumService.delete(id);
    }
}
