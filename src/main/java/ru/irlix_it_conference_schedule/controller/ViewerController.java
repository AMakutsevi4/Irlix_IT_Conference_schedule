package ru.irlix_it_conference_schedule.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.irlix_it_conference_schedule.dto.ViewerDTO;
import ru.irlix_it_conference_schedule.model.Viewer;
import ru.irlix_it_conference_schedule.service.ViewerService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/viewers")
@Tag(name="Зритель", description="Данный контроллер содержит CRUD операции с сущностью зритель")
public class ViewerController {

    private final ViewerService viewerService;

    @GetMapping
    public List<ViewerDTO> getAll() {
        return viewerService.findAll();
    }

    @GetMapping("/{id}")
    public ViewerDTO getById(@PathVariable Long id) {
        return viewerService.findById(id);
    }

    @PostMapping
    public ViewerDTO create(@RequestBody Viewer viewer) {
        return viewerService.save(viewer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        viewerService.delete(id);
    }
}
