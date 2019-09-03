package animalshop.api.data;

import animalshop.api.model.domain.Animal;
import org.springframework.data.repository.CrudRepository;


public interface AnimalRepository extends CrudRepository<Animal, Integer> {
    
}
