package dtos;

import entities.Harbour;
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
public class HarbourDTO {
    private Long id;
    private String name;
    private String address;
    private int capacity;
    private List<BoatsDTO> boat = new ArrayList<>();

    public HarbourDTO(Harbour harbour) {
        this.name = harbour.getName();
        this.address = harbour.getAddress();
        this.capacity = harbour.getCapacity();
        this.boat = BoatsDTO.getDTOs(harbour.getBoat());
    }

    public static List<HarbourDTO> getDTOs(List<Harbour> harbours){
        List<HarbourDTO> harbourDTOs = new ArrayList<>();
        harbours.forEach(harbour -> harbourDTOs.add(new HarbourDTO(harbour)));
        return harbourDTOs;
    }
}
