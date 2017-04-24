package synerzip.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import synerzip.models.SalesDetails;
import synerzip.repositories.SalesDetailsRepository;

@Service
public class SalesDetailsService {

	@Autowired
	private SalesDetailsRepository repository;
	
	 public List<SalesDetails> getList() {
	        return (List<SalesDetails>) repository.findAll();
	    }

	 public SalesDetails getByID(Long id){
		 return repository.findOne(id);
	 }

	    public void save(SalesDetails obj) {
	        repository.save(obj);
	    }
	
	
	
}
