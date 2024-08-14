package ru.irlix_it_conference_schedule.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.irlix_it_conference_schedule.dto.ReportDTO;
import ru.irlix_it_conference_schedule.model.Report;
import ru.irlix_it_conference_schedule.repository.ReportRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportService {

    private final ReportRepository reportRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    public List<ReportDTO> findAll() {
        List<ReportDTO> reportDTOs = new ArrayList<>();
        reportRepository.findAll().forEach(report -> reportDTOs.add(convertToDTO(report)));
        return reportDTOs;
    }

    public ReportDTO findById(Long id) {
        var rsl = reportRepository.findById(id).orElse(null);
        return convertToDTO(rsl);
    }

    public List<Report> findByAuditoriumId(Long auditorium_Id) {
        return reportRepository.findByAuditorium_Id(auditorium_Id);
    }

    public ReportDTO save(Report report) {
       var rsl = reportRepository.save(report);
        return convertToDTO(rsl);
    }

    public void delete(Long id) {
        reportRepository.deleteById(id);
    }

    public ReportDTO convertToDTO(Report report) {
        return modelMapper.map(report, ReportDTO.class);
    }
}
