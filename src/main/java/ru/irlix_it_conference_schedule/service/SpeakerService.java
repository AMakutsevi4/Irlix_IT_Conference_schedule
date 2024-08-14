package ru.irlix_it_conference_schedule.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.irlix_it_conference_schedule.dto.SpeakerDTO;
import ru.irlix_it_conference_schedule.model.Speaker;
import ru.irlix_it_conference_schedule.repository.SpeakerRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SpeakerService {

    private final SpeakerRepository speakerRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    public List<SpeakerDTO> findAll() {
        List<SpeakerDTO> speakerDTOs = new ArrayList<>();
        speakerRepository
                .findAll()
                .forEach(speaker -> speakerDTOs.add(convertToDTO(speaker)));
        return speakerDTOs;
    }

    public SpeakerDTO findById(Long id) {
        var rsl = speakerRepository.findById(id).orElse(null);
        return convertToDTO(rsl);
    }

    public SpeakerDTO save(Speaker speaker) {
        var rsl = speakerRepository.save(speaker);
        return convertToDTO(rsl);
    }

    public void delete(Long id) {
        speakerRepository.deleteById(id);
    }

    public SpeakerDTO convertToDTO(Speaker speaker) {
        return modelMapper.map(speaker, SpeakerDTO.class);
    }
}
