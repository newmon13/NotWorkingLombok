package dev.jlipka.notworkinglombok.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data // Zapewnia generowanie getterów, setterów, equals(), hashCode() i toString()
@Table(name = "auditoriums")
public class Auditorium {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int capacity;
    @Enumerated(EnumType.STRING)
    @Column(name = "auditorium_type")
    private AuditoriumType auditoriumType;
    @Enumerated(EnumType.STRING)
    @Column(name = "screen_type")
    private ScreenType screenType;

}
