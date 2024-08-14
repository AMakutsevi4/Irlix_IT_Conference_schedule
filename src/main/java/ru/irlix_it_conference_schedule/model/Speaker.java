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
@Table(name = "speakers")
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private int age;
    private int number_phone;
    private String email;
    private byte[] photo;


    @ManyToMany
    @JoinTable(
            name = "speaker_roles",
            joinColumns = @JoinColumn(name = "speaker_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();

    /*Доклады, созданные пользователем*/
    @OneToMany(mappedBy = "speaker")
    private Set<Report> reports = new HashSet<>();

}
