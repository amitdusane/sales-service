package synerzip.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import synerzip.models.SalesDetails;

@Repository
public interface SalesDetailsRepository extends CrudRepository<SalesDetails, Long> {

}
