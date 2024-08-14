package ru.irlix_it_conference_schedule.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.irlix_it_conference_schedule.dto.SpeakerDTO;
import ru.irlix_it_conference_schedule.model.Speaker;
import ru.irlix_it_conference_schedule.service.SpeakerService;

import java.util.List;

@RestController
@RequestMapping("/api/speakers")
@RequiredArgsConstructor
@Tag(name="Выступающий", description="Данный контроллер содержит CRUD операции с сущностью выступающий")
public class SpeakerController {

    private final SpeakerService speakerService;

    @GetMapping
    public List<SpeakerDTO> getAll() {
        return speakerService.findAll();
    }

    @GetMapping("/{id}")
    public SpeakerDTO getById(@PathVariable Long id) {
        return speakerService.findById(id);
    }

    @PostMapping
    public SpeakerDTO create(@RequestBody Speaker speaker) {
        return speakerService.save(speaker);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        speakerService.delete(id);
    }
}
