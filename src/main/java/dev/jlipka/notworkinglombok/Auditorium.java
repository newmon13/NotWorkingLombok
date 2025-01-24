package dev.jlipka.notworkinglombok;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

