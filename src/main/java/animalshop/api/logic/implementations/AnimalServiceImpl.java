package animalshop.api.logic.implementations;

import animalshop.api.data.AnimalRepository;
import animalshop.api.logic.interfaces.AnimalService;
import animalshop.api.model.communication.response.PostAnimalResponse;
import animalshop.api.model.domain.Animal;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {
    private AnimalRepository animalRepository;
    private Environment environment;

    
    public AnimalServiceImpl(AnimalRepository animalRepository, Environment environment) {
        this.animalRepository = animalRepository;
        this.environment = environment;
    }

    @Override
    public PostAnimalResponse PutAnimal(Animal animal)
    {
        Animal savedAnimal = animalRepository.save(animal);
        boolean existed = false;
        if(savedAnimal == null) {
            existed = true;
        }
        String animalLocation = environment.getProperty("baseUrl") + "/animals/" + savedAnimal.getId();

        return new PostAnimalResponse(animalLocation, existed);
    }

    @Override
    public  Animal GetAnimal(int id)
    {
        return animalRepository.findById(id).orElse(null);
    }


}
