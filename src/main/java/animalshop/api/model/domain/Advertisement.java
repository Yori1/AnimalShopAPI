package animalshop.api.model.domain;

public class Advertisement {
    private String description;
    private int priceEuroCents;
    private Animal animalBeingSold;

    public Advertisement(String description, int priceEuroCents, Animal animalBeingSold) {
        this.description = description;
        this.priceEuroCents = priceEuroCents;
        this.animalBeingSold = animalBeingSold;
    }
}
