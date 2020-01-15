package example.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Aircraft details
 */
@Entity
@Table(name = "aircraft")
@Getter
@Setter(value = AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aircraft_generator")
    @SequenceGenerator(name = "aircraft_generator", sequenceName = "aircraft_sequence", allocationSize = 1)
    private Long id;

    /**
     * Display name
     */
    private String name;

}
