package synerzip.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import synerzip.models.Vendor;
import synerzip.repositories.CustomerRepository;
import synerzip.repositories.VendorRepository;

@Service
public class GenericService {

	@Autowired
	private VendorRepository repository;
	@Autowired
	private CustomerRepository custRepo;

	public Object getByID(String from, Long id) {
		if("vendor".equalsIgnoreCase(from)){
			return repository.findOne(id);
		}
		return custRepo.findOne(id);
	}

	public List<Vendor> getList() {
		return (List<Vendor>) repository.findAll();
	}

	public void save(Vendor obj) {
		repository.save(obj);
	}

}
