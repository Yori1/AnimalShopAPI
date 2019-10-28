package animalshop.api.model.communication.response;

public class PostAnimalResponse {
    private String Location;
    private boolean Conflict = false;

    public PostAnimalResponse(String location, boolean conflict) {
        Location = location;
        Conflict = conflict;
    }

    public String getLocation() {
        return Location;
    }

    public boolean isConflict() {
        return Conflict;
    }
}
