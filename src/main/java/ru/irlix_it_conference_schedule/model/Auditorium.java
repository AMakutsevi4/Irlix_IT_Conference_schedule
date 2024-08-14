package ru.irlix_it_conference_schedule.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "auditoriums")
public class Auditorium {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    /*Доклады в аудитории*/
    @OneToMany(mappedBy = "auditorium")
    private Set<Report> reports = new HashSet<>();

}
