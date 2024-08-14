package ru.irlix_it_conference_schedule.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.irlix_it_conference_schedule.model.Auditorium;
import ru.irlix_it_conference_schedule.model.Speaker;
import ru.irlix_it_conference_schedule.model.Viewer;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Сущность доклада")
public class ReportDTO {
    private  String description;
    private LocalDateTime dateAndTimeStart;
    private Double duration;
    private Speaker speaker;
    private Auditorium auditorium;
    private Set<Viewer> viewers = new HashSet<>();
}
