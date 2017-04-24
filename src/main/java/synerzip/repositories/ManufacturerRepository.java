package synerzip.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import synerzip.models.Manufacturer;

@Repository
public interface ManufacturerRepository extends CrudRepository<Manufacturer, Long> {

}
