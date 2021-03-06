package animalshop.api.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id = 0;
    private String name;
    private String kind;

    public Animal(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    public Animal(int id, String name, String kind) {
        Id = id;
        this.name = name;
        this.kind = kind;
    }

    public Animal(){}

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }
}
