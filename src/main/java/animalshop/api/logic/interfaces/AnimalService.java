package animalshop.api.logic.interfaces;

import animalshop.api.model.communication.response.PostAnimalResponse;
import animalshop.api.model.domain.Animal;
import org.springframework.stereotype.Service;

@Service
public interface AnimalService {
     PostAnimalResponse PutAnimal(Animal animal);
}
