package synerzip.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import synerzip.models.Sales;
import synerzip.repositories.SalesRepository;

@Service
public class SalesService {

	@Autowired
	private SalesRepository repository;

	public Sales getByID(Long id) {
		return repository.findOne(id);
	}

	public List<Sales> getList() {
		return (List<Sales>) repository.findAll();
	}

	public void save(Sales obj) {
		repository.save(obj);
	}

}
