package dtos;

import entities.Owner;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class OwnerDTO {
    private Long id;
    private String name;
    private String address;
    private String phone;
    private List<BoatsDTO> boatList = new ArrayList<>();

    public OwnerDTO(Owner owner) {
        this.name = owner.getName();
        this.address = owner.getAddress();
        this.phone = owner.getPhone();
        this.boatList = BoatsDTO.getDTOs(owner.getBoatList());
    }
    public static List<OwnerDTO> getDTOs(List<Owner> owners){
        List<OwnerDTO> ownerDTOs = new ArrayList<>();
        owners.forEach(owner -> ownerDTOs.add(new OwnerDTO(owner)));
        return ownerDTOs;
    }

}
