package dev.jlipka.notworkinglombok;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NotWorkingLombokApplication {

    public static void main(final String[] args) {
        SpringApplication.run(NotWorkingLombokApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(AuditoriumRepository repository) {
//        return args -> {
//            Auditorium auditorium = Auditorium.builder()
//                    .name("Sala 1")
//                    .capacity(12)
//                    .screenType(ScreenType.TYPE_2D)
//                    .auditoriumType(AuditoriumType.REGULAR)
//                    .build();
//
//            repository.save(auditorium);
//        };
//    }

}
