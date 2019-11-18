package animalshop.api.spring.controllers;

import animalshop.api.data.AnimalRepository;
import animalshop.api.logic.interfaces.AnimalService;
import animalshop.api.model.communication.response.PostAnimalResponse;
import animalshop.api.model.domain.Animal;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

@RestController
public class AnimalController {
   private AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @RequestMapping(
            value = "animals",
            method = { RequestMethod.POST, RequestMethod.PUT }
    )
    public PostAnimalResponse PostAnimal(Animal animal)
    {
         PostAnimalResponse postAnimalResponse = animalService.PutAnimal(animal);
        if(postAnimalResponse.isConflict()) {
            throw new HttpServerErrorException(HttpStatus.CONFLICT);
        }
        return postAnimalResponse;
    }/*d*/

    @RequestMapping(
            value = "animals",
            method = { RequestMethod.GET }
    )

    @GetMapping("/animals/{id}")
    public Animal GetAnimal(@PathVariable int id)
    {
        Animal animal = animalService.GetAnimal(id);
        return animal;
    }


}
