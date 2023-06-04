package dtos;

import entities.Boats;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class BoatsDTO {
    private Long id;
    private String brand;
    private String make;
    private String image;
    private HarbourDTO harbour;

    public BoatsDTO(Boats boats) {
        this.brand = boats.getBrand();
        this.make = boats.getMake();
        this.image = boats.getImage();
        this.harbour = new HarbourDTO(boats.getHarbour());
    }

    public static List<BoatsDTO> getDTOs(List<Boats> boats){
        List<BoatsDTO> boatsDTOs = new ArrayList<>();
        boats.forEach(boat -> boatsDTOs.add(new BoatsDTO(boat)));
        return boatsDTOs;
    }
}
