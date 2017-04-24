package synerzip.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import synerzip.models.Customer;
import synerzip.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;

	public Customer getByID(Long id) {
		return repository.findOne(id);
	}

	public List<Customer> getList() {
		return (List<Customer>) repository.findAll();
	}

	public void save(Customer obj) {
		repository.save(obj);
	}

}
