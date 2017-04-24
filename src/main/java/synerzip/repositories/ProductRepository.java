package synerzip.repositories;

import org.springframework.data.repository.CrudRepository;

import synerzip.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
