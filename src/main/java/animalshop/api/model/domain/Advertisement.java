package animalshop.api.model.domain;

import javax.persistence.*;

@Entity
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id = 0;
    private String description;
    private int priceEuroCents;
    @OneToOne(fetch = FetchType.EAGER, optional = false)
    private Animal animalBeingSold;

    public Advertisement(String description, int priceEuroCents, Animal animalBeingSold) {
        this.description = description;
        this.priceEuroCents = priceEuroCents;
        this.animalBeingSold = animalBeingSold;
    }

    public Advertisement() {

    }

    public int getId() {
        return Id;
    }

    public String getDescription() {
        return description;
    }

    public int getPriceEuroCents() {
        return priceEuroCents;
    }

    public Animal getAnimalBeingSold() {
        return animalBeingSold;
    }
}
