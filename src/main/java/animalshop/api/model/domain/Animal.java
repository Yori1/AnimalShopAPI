package animalshop.api.model.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animal {
    @Id
    private int Id;
    private String name;
    private Kind kind;

    public Animal(String name, Kind kind) {
        this.name = name;
        this.kind = kind;
    }

    public Animal(int id, String name, Kind kind) {
        Id = id;
        this.name = name;
        this.kind = kind;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public Kind getKind() {
        return kind;
    }
}
