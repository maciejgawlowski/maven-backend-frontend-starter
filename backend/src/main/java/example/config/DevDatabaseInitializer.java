package example.config;

import com.fasterxml.jackson.core.type.*;
import com.fasterxml.jackson.databind.*;
import example.domain.*;
import example.repository.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.*;
import org.springframework.stereotype.*;

import javax.annotation.*;
import java.io.*;
import java.util.*;

import static example.config.Profile.*;

@Profile(LOCAL)
@Slf4j
@Component
@RequiredArgsConstructor
public class DevDatabaseInitializer {

    private static final String AIRCRAFTS_JSON = "dev-data/aircrafts.json";

    private final AircraftRepository aircraftRepository;
    private final ObjectMapper objectMapper;

    @PostConstruct
    private void init() {
        log.info("Initializing databse");
        List<Aircraft> aircrafts = readAircraftsFromFile();
        aircraftRepository.saveAll(aircrafts);
        log.info("Database initialized with {} aircrafts", aircrafts.size());
    }

    private List<Aircraft> readAircraftsFromFile() {
        try {
            return objectMapper.readValue(new ClassPathResource(AIRCRAFTS_JSON).getURL(), new TypeReference<>() {
            });
        } catch (IOException e) {
            log.error("Error occurred during DEV database initialization", e);
            return Collections.emptyList();
        }
    }
}
