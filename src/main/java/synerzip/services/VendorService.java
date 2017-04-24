package synerzip.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import synerzip.models.Vendor;
import synerzip.repositories.VendorRepository;

@Service
public class VendorService {

	@Autowired
	private VendorRepository repository;

	public Vendor getByID(Long id) {
		return repository.findOne(id);
	}

	public List<Vendor> getList() {
		return (List<Vendor>) repository.findAll();
	}

	public void save(Vendor obj) {
		repository.save(obj);
	}

}
