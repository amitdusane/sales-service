package synerzip.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import synerzip.models.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
