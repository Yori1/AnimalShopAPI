package animalshop.api.logic.implementations;

import animalshop.api.model.domain.Advertisement;
import animalshop.api.model.domain.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class AnimalServiceImplTest {
    @Autowired
    AnimalServiceImpl animalService;

    @Test
    public void getAnimal() {
        Animal animal = new Animal("animal", "Dog");
        animalService.PutAnimal(animal);
        Animal animalGotten = animalService.GetAnimal(animal.getId());
        Assert.assertTrue(animal.getName() == animalGotten.getName());
    }
}