package synerzip.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import synerzip.models.Shop;

@Repository
public interface ShopRepository extends CrudRepository<Shop, Long> {

}
