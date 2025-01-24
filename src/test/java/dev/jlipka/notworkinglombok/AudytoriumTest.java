package dev.jlipka.notworkinglombok;

import dev.jlipka.notworkinglombok.model.Auditorium;
import dev.jlipka.notworkinglombok.model.AuditoriumType;
import dev.jlipka.notworkinglombok.model.ScreenType;
import dev.jlipka.notworkinglombok.repository.AuditoriumRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
class AuditoriumTest {

    @Autowired
    private AuditoriumRepository auditoriumRepository;

    @Test
    void testAuditoriumSave() {
        // Przygotowanie danych do testu
        Auditorium auditorium = Auditorium.builder()
                .name("Sala 1")
                .capacity(12)
                .screenType(ScreenType.TYPE_2D)
                .auditoriumType(AuditoriumType.REGULAR)
                .build();

        // Zapisanie do bazy i wymuszenie zapisu (flush)
        auditoriumRepository.saveAndFlush(auditorium);

        // Sprawdzenie, czy dane zostały zapisane poprawnie
        Auditorium savedAuditorium = auditoriumRepository.findById(auditorium.getId()).orElseThrow();

        // Assercje
        assertEquals("Sala 1", savedAuditorium.getName());
        assertEquals(12, savedAuditorium.getCapacity());
        assertEquals(ScreenType.TYPE_2D, savedAuditorium.getScreenType());
        assertEquals(AuditoriumType.REGULAR, savedAuditorium.getAuditoriumType());
    }
}
