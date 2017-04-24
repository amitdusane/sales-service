package synerzip.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import synerzip.models.Stock;

@Repository
public interface StockRepository extends CrudRepository<Stock, Long> {

}
