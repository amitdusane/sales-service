package synerzip.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import synerzip.models.Vendor;

@Repository
public interface VendorRepository extends CrudRepository<Vendor, Long> {

}
