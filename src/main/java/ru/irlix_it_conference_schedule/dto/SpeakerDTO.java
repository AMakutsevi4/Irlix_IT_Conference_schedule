package ru.irlix_it_conference_schedule.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.irlix_it_conference_schedule.model.Report;
import ru.irlix_it_conference_schedule.model.Role;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Сущность выступающего")
public class SpeakerDTO {
    private String first_name;
    private int age;
    private int number_phone;
    private String email;
    private byte[] photo;
    private List<Role> roles;
    private List<Report> reports;

}
