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
@Table(name = "viewers")
public class Viewer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private int phone_number;
    private String email;
    /*Доступ к докладам*/
    @ManyToMany(mappedBy = "viewers")
    private Set<Report> reports = new HashSet<>();
}
