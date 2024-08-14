package ru.irlix_it_conference_schedule.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.irlix_it_conference_schedule.dto.ViewerDTO;
import ru.irlix_it_conference_schedule.model.Viewer;
import ru.irlix_it_conference_schedule.repository.ViewerRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ViewerService {

    private final ViewerRepository viewerRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    public List<ViewerDTO> findAll() {
        List<ViewerDTO> viewerDTOs = new ArrayList<>();
        viewerRepository
                .findAll()
                .forEach(viewer -> viewerDTOs.add(convertToDTO(viewer)));
        return viewerDTOs;
    }

    public ViewerDTO findById(Long id) {
        var rsl = viewerRepository.findById(id).orElse(null);
        return convertToDTO(rsl);
    }

    public ViewerDTO save(Viewer viewer) {
        var rsl = viewerRepository.save(viewer);
        return convertToDTO(rsl);
    }

    public void delete(Long id) {
        viewerRepository.deleteById(id);
    }

    public ViewerDTO convertToDTO(Viewer viewer) {
        return modelMapper.map(viewer, ViewerDTO.class);
    }
}
