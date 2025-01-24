package dev.jlipka.notworkinglombok.repository;

import dev.jlipka.notworkinglombok.model.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriumRepository extends JpaRepository<Auditorium, Long> {
    // Możesz dodać dodatkowe metody zapytań, jeśli potrzeba
}
