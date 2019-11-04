package animalshop.api.logic.implementations;

import animalshop.api.ApiApplication;
import animalshop.api.logic.interfaces.AdvertisementService;
import animalshop.api.model.domain.Advertisement;
import animalshop.api.model.domain.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class AdvertisementServiceImplTest {

    @Autowired
    AdvertisementServiceImpl advertisementService;

    @Test
    public void getAdvertisement() {
        Animal animal = new Animal(0, "animal", "Dog");
        Advertisement advertisement = new Advertisement("ad", 5, animal);
        this.advertisementService.AddAdvertisement(advertisement);
        Advertisement gottenAdvertisement = this.advertisementService.GetAdvertisement(1);
        Assert.assertTrue(gottenAdvertisement.getDescription() == advertisement.getDescription());
        Assert.assertTrue(advertisement.getAnimalBeingSold().getName() == animal.getName());
    }
}