package animalshop.api.logic.implementations;

import animalshop.api.data.AdvertismentRepository;
import animalshop.api.data.AnimalRepository;
import animalshop.api.logic.interfaces.AdvertisementService;
import animalshop.api.model.communication.response.PostAdvertisementResult;
import animalshop.api.model.domain.Advertisement;
import animalshop.api.model.domain.Animal;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {
    private AdvertismentRepository advertismentRepository;
    private AnimalRepository animalRepository;
    private Environment environment;


    public AdvertisementServiceImpl(AdvertismentRepository advertismentRepository, AnimalRepository animalRepository,
            Environment environment) {
        this.advertismentRepository = advertismentRepository;
        this.animalRepository = animalRepository;
        this.environment = environment;
    }

    
    public PostAdvertisementResult AddAdvertisement(Advertisement advertisement) {
        Animal animal = animalRepository.save(advertisement.getAnimalBeingSold());
        Advertisement advertisementSaved =  advertismentRepository.save(advertisement);
        PostAdvertisementResult postAdvertisementResult = null;
        if(advertisementSaved != null) {
            String animalLocation = environment.getProperty("baseUrl") + "/animals/" + animal.getId();
            String advertisementLocation = environment.getProperty("baseUrl") + "/advertisements/" + advertisementSaved.getId();
            postAdvertisementResult = new PostAdvertisementResult(animalLocation, advertisementLocation);
        }
        return postAdvertisementResult;
    }

    @Override
    public Advertisement GetAdvertisement(int id) {
        return advertismentRepository.findById(id).orElse(null);
    }

}
