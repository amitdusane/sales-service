package synerzip.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import synerzip.models.Sales;

@Repository
public interface SalesRepository extends CrudRepository<Sales, Long> {

}
