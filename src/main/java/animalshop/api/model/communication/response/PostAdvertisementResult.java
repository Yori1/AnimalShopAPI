package animalshop.api.model.communication.response;

public class PostAdvertisementResult {
    private String LocationAdvertisement;
    private String LocationAnimal;

    public PostAdvertisementResult(String locationAdvertisement, String locationAnimal) {
        LocationAdvertisement = locationAdvertisement;
        LocationAnimal = locationAnimal;
    }

    public String getLocationAdvertisement() {
        return LocationAdvertisement;
    }

    public String getLocationAnimal() {
        return LocationAnimal;
        }
    


    
}
