package entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

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

    @ManyToMany(mappedBy = "boatList")
    private List<Owner> owner;

    @ManyToOne
    @JoinColumn(name = "harbour_id")
    private Harbour harbour;


}
