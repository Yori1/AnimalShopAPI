/*package animalshop.api;

import animalshop.api.model.communication.response.PostAdvertisementResult;
import animalshop.api.model.domain.Advertisement;
import animalshop.api.model.domain.Animal;
import animalshop.api.model.domain.Kind;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@ContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AdvertisementControllerTest {
    @Value("${local.server.port}")
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldBeAbleToPostAndGet() throws Exception {
        Animal animalToSell = new Animal("Anim", Kind.Dog);
        Advertisement advertisement = new Advertisement("something", 400, animalToSell);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<Advertisement> request = new HttpEntity<>(advertisement, headers);

        PostAdvertisementResult response = this.restTemplate.postForObject("http://localhost:" + port + "/advertisements",
                request, PostAdvertisementResult.class);
        assertThat(response != null);
        Animal animal = this.restTemplate.getForObject("http://localhost:" + port + "/",
                Animal.class);
        assertThat(animal != null);
    }
}
*/