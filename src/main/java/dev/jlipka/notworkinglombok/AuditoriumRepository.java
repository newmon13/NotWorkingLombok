package dev.jlipka.notworkinglombok;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface AuditoriumRepository extends CrudRepository<Auditorium, Long> {
}
