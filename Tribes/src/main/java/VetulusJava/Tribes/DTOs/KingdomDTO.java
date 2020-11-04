package VetulusJava.Tribes.DTOs;

import VetulusJava.Tribes.Entities.Building;
import VetulusJava.Tribes.Entities.Resource;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;
@Getter
@Setter
public class KingdomDTO {
    private Long id;
    private String name;
    private int x;
    private int y;
    private Set<Building> buildings;
    private Set<Resource> resources;

    public KingdomDTO(){}
    public KingdomDTO(Long id, String name, int x, int y, Set<Building> buildings, Set<Resource> resources) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.buildings = buildings;
        this.resources = resources;
    }
}
