package animalshop.api.logic.implementations;

import animalshop.api.logic.interfaces.AnimalService;
import animalshop.api.model.communication.response.PostAnimalResponse;
import animalshop.api.model.domain.Animal;
import org.springframework.stereotype.Service;

@Service
public class AnimalServiceImpl implements AnimalService {
    @Override
    public PostAnimalResponse PutAnimal(Animal animal) {
        return null;
    }
}
