package entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "boats")
public class Boats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boat_id")
    private Long id;
    @Column(name="brand")
    private String brand;
    @Column(name="make")
    private String make;
    @Column(name="image")
    private String image;


}
