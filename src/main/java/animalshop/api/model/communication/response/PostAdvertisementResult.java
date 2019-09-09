package animalshop.api.model.communication.response;

public class PostAdvertisementResult {
    private int idAddedWith;

    public PostAdvertisementResult(int idAddedWith) {
        this.idAddedWith = idAddedWith;
    }

    public int getIdAddedWith() {
        return idAddedWith;
    }
}
