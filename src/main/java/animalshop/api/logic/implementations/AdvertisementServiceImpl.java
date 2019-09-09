package animalshop.api.logic.implementations;

import animalshop.api.data.AdvertismentRepository;
import animalshop.api.data.AnimalRepository;
import animalshop.api.logic.interfaces.AdvertisementService;
import animalshop.api.model.communication.response.PostAdvertisementResult;
import animalshop.api.model.domain.Advertisement;
import org.springframework.stereotype.Service;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {
    private AdvertismentRepository advertismentRepository;
    private AnimalRepository animalRepository;

    public AdvertisementServiceImpl(AdvertismentRepository advertismentRepository, AnimalRepository animalRepository) {
        this.advertismentRepository = advertismentRepository;
        this.animalRepository = animalRepository;
    }

    public PostAdvertisementResult AddAdvertisement(Advertisement advertisement) {
        animalRepository.save(advertisement.getAnimalBeingSold());
        Advertisement advertisementSaved =  advertismentRepository.save(advertisement);
        PostAdvertisementResult postAdvertisementResult = null;
        if(advertisementSaved != null) {
            postAdvertisementResult = new PostAdvertisementResult(advertisementSaved.getId());
        }
        return postAdvertisementResult;
    }

    @Override
    public Advertisement GetAdvertisement(int id) {
        return advertismentRepository.findById(id).orElse(null);
    }
}
