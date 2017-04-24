package synerzip.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import synerzip.models.Manufacturer;
import synerzip.repositories.ManufacturerRepository;

@Service
public class ManufacturerService {

	@Autowired
	private ManufacturerRepository repository;
	
	 public List<Manufacturer> getList() {
	        return (List<Manufacturer>) repository.findAll();
	    }


	    public void save(Manufacturer obj) {
	        repository.save(obj);
	    }
	
	
	
}
