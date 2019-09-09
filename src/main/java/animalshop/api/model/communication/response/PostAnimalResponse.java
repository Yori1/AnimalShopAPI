package animalshop.api.model.communication.response;

public class PostAnimalResponse {
    private int Location;
    private boolean Conflict = false;

    public PostAnimalResponse(int location, boolean conflict) {
        Location = location;
        Conflict = conflict;
    }

    public int getLocation() {
        return Location;
    }

    public boolean isConflict() {
        return Conflict;
    }
}
