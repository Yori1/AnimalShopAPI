package animalshop.api.data;

import animalshop.api.model.domain.Advertisement;
import org.springframework.data.repository.CrudRepository;

public interface AdvertismentRepository extends CrudRepository<Advertisement, Integer> {
}
