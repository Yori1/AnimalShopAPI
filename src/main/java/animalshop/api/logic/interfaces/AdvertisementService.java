package animalshop.api.logic.interfaces;

import animalshop.api.model.communication.response.PostAdvertisementResult;
import animalshop.api.model.domain.Advertisement;
import org.springframework.stereotype.Service;

@Service
public interface AdvertisementService {
    PostAdvertisementResult AddAdvertisement(Advertisement advertisement);
    Advertisement GetAdvertisement(int id);
}
