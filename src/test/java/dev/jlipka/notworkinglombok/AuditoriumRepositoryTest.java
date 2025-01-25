package dev.jlipka.notworkinglombok;

import dev.jlipka.notworkinglombok.model.Auditorium;
import dev.jlipka.notworkinglombok.model.AuditoriumType;
import dev.jlipka.notworkinglombok.model.ScreenType;
import dev.jlipka.notworkinglombok.repository.AuditoriumRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest // Automatyczna konfiguracja testów JPA z użyciem H2
class AuditoriumRepositoryTest {

    @Autowired
    private AuditoriumRepository auditoriumRepository;

    @Test
    void shouldSaveAndFindAuditoriumInDatabase() {
        // Given: Przygotowanie danych testowych
        Auditorium auditorium = Auditorium.builder()
                .name("Test Auditorium")
                .capacity(200)
                .auditoriumType(AuditoriumType.REGULAR)
                .screenType(ScreenType.TYPE_2D)
                .build();

        // When: Zapis do bazy danych
        Auditorium savedAuditorium = auditoriumRepository.save(auditorium);

        // Then: Pobranie obiektu z bazy danych
        Optional<Auditorium> foundAuditorium = auditoriumRepository.findById(savedAuditorium.getId());

        // Asercje: Sprawdzamy, czy zapisany obiekt jest poprawny
        assertThat(foundAuditorium).isPresent();
        assertThat(foundAuditorium.get().getName()).isEqualTo("Test Auditorium");
        assertThat(foundAuditorium.get().getCapacity()).isEqualTo(200);
        assertThat(foundAuditorium.get().getAuditoriumType()).isEqualTo(AuditoriumType.REGULAR);
        assertThat(foundAuditorium.get().getScreenType()).isEqualTo(ScreenType.TYPE_2D);
    }
}
