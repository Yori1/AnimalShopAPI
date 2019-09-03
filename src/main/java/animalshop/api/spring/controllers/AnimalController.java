package animalshop.api.spring.controllers;

import animalshop.api.data.AnimalRepository;
import animalshop.api.model.communication.response.PostAnimalResponse;
import animalshop.api.model.domain.Animal;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpServerErrorException;

public class AnimalController {
   /* private AnimalRepository animalRepository;

    @RequestMapping(
            value = "animals",
            method = { RequestMethod.PUT }
    )
    public PostAnimalResponse PostAnimal(Animal animal)
    {
        Animal savedAnimal = animalRepository.save(animal);
        if(savedAnimal == null) {
            throw new HttpServerErrorException(HttpStatus.CONFLICT);
        }
        return new PostAnimalResponse(savedAnimal.getId());
    }

    @RequestMapping(
            value = "animals"
    )
    public Animal GetAnimal(@RequestParam("id") int id)
    {
        Animal animal = animalRepository.findById(id).orElse(null);
        return animal;
    }*/


}
