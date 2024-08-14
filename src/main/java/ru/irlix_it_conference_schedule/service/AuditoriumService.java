package ru.irlix_it_conference_schedule.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.irlix_it_conference_schedule.dto.AuditoriumDTO;
import ru.irlix_it_conference_schedule.model.Auditorium;
import ru.irlix_it_conference_schedule.repository.AuditoriumRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AuditoriumService {

    private final AuditoriumRepository auditoriumRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    public List<AuditoriumDTO> findAll() {
        List<AuditoriumDTO> auditoriumDTOs = new ArrayList<>();
        auditoriumRepository
                .findAll()
                .forEach(auditorium -> auditoriumDTOs.add(convertToDTO(auditorium)));
        return auditoriumDTOs;
    }

    public AuditoriumDTO findById(Long id) {
        var rsl = auditoriumRepository.findById(id).orElse(null);
        return convertToDTO(rsl);
    }

    public AuditoriumDTO save(Auditorium auditorium) {
        var rsl = auditoriumRepository.save(auditorium);
        return convertToDTO(rsl);
    }

    public void delete(Long id) {
        auditoriumRepository.deleteById(id);
    }

    public AuditoriumDTO convertToDTO(Auditorium auditorium) {
        return modelMapper.map(auditorium, AuditoriumDTO.class);
    }
}
