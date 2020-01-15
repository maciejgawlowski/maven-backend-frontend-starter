package example.controller.api;

import example.domain.*;
import example.repository.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequiredArgsConstructor
public class AircraftController extends ApiController {

    private final AircraftRepository repository;

    @GetMapping("/aircrafts")
    public ResponseEntity<List<Aircraft>> getAircrafts() {
        return ResponseEntity.ok(repository.findAll());
    }

}
