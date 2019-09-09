package animalshop.api.spring.controllers;

import animalshop.api.logic.interfaces.AdvertisementService;
import animalshop.api.model.communication.response.PostAdvertisementResult;
import animalshop.api.model.communication.response.PostAnimalResponse;
import animalshop.api.model.domain.Advertisement;
import animalshop.api.model.domain.Animal;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

@RestController
public class AdvertisementController {
    private AdvertisementService advertisementService;

    public AdvertisementController(AdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    @PostMapping("/advertisements")
    public PostAdvertisementResult PostAdvertisement(@RequestBody Advertisement advertisement)
    {
        PostAdvertisementResult postResponse = advertisementService.AddAdvertisement(advertisement);
        if(postResponse == null) {
            throw new HttpServerErrorException(HttpStatus.CONFLICT);
        }
        return (postResponse);
    }

    @GetMapping("/advertisements/{id}")
    public Advertisement GetAdvertisement(@PathVariable int id)
    {
        Advertisement advertisement = advertisementService.GetAdvertisement(id);
        return advertisement;
    }
}
