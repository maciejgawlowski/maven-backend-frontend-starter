package example.repository;

import example.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface AircraftRepository extends JpaRepository<Aircraft, Long> {
}
