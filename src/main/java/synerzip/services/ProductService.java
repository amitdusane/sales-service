package synerzip.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import synerzip.models.Product;
import synerzip.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	 public List<Product> getList() {
	        return (List<Product>) repository.findAll();
	    }

	 public Product getByID(Long id){
		 return repository.findOne(id);
	 }

	    public void save(Product obj) {
	        repository.save(obj);
	    }
	
	
	
}
