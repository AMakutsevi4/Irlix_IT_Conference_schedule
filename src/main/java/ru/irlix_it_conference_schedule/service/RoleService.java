package ru.irlix_it_conference_schedule.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.irlix_it_conference_schedule.dto.RoleDTO;
import ru.irlix_it_conference_schedule.model.Role;
import ru.irlix_it_conference_schedule.repository.RoleRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    public List<RoleDTO> findAll() {
             List<RoleDTO> roleDTOs = new ArrayList<>();
             roleRepository
                     .findAll()
                     .forEach(role -> roleDTOs.add(convertToDTO(role)));
        return roleDTOs;
    }

    public RoleDTO findById(Long id) {
        var rsl = roleRepository.findById(id).orElse(null);
        return convertToDTO(rsl);
    }

    public RoleDTO save(Role role) {
        var rsl = roleRepository.save(role);
        return convertToDTO(rsl);
    }

    public void delete(Long id) {
        roleRepository.deleteById(id);
    }

    public RoleDTO convertToDTO(Role role) {
        return modelMapper.map(role, RoleDTO.class);
    }
}
