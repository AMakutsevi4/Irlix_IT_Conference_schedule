package ru.irlix_it_conference_schedule.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.irlix_it_conference_schedule.dto.RoleDTO;
import ru.irlix_it_conference_schedule.model.Role;
import ru.irlix_it_conference_schedule.service.RoleService;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
@RequiredArgsConstructor
@Tag(name="Роль", description="Данный контроллер содержит CRUD операции с сущностью роль")
public class RoleController {
    private final RoleService roleService;

    @GetMapping
    public List<RoleDTO> getAll() {
        return roleService.findAll();
    }

    @GetMapping("/{id}")
    public RoleDTO getById(@PathVariable Long id) {
        return roleService.findById(id);
    }

    @PostMapping
    public RoleDTO create(@RequestBody Role role) {
        return roleService.save(role);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        roleService.delete(id);
    }
}
