package animalshop.api.logic.implementations;

import animalshop.api.data.AnimalRepository;
import animalshop.api.logic.interfaces.AnimalService;
import animalshop.api.model.communication.response.PostAnimalResponse;
import animalshop.api.model.domain.Animal;
import org.springframework.stereotype.Service;

@Service
public class AnimalServiceImpl implements AnimalService {
    private AnimalRepository animalRepository;

    public AnimalServiceImpl(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public PostAnimalResponse PutAnimal(Animal animal)
    {
        Animal savedAnimal = animalRepository.save(animal);
        int animalId = 0;
        boolean existed = false;
        if(savedAnimal != null) {
            animalId = savedAnimal.getId();
            existed = true;
        }
        return new PostAnimalResponse(animalId, existed);
    }

    @Override
    public  Animal GetAnimal(int id)
    {
        return animalRepository.findById(id).orElse(null);
    }


}
