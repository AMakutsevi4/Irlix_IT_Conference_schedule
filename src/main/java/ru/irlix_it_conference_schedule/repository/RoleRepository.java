package ru.irlix_it_conference_schedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.irlix_it_conference_schedule.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
