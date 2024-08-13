package ru.irlix_it_conference_schedule.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.irlix_it_conference_schedule.model.Report;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Сущность аудитории")
public class AuditoriumDTO {

    private String description;
    private List<Report> reports;

}
