package synerzip.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import synerzip.models.Shop;
import synerzip.repositories.ShopRepository;

@Service
public class ShopService {

	@Autowired
	private ShopRepository repository;

	public Shop getByID(Long id) {
		return repository.findOne(id);
	}

	public List<Shop> getList() {
		return (List<Shop>) repository.findAll();
	}

	public void save(Shop obj) {
		repository.save(obj);
	}

}
