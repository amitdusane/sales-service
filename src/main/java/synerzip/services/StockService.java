package synerzip.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import synerzip.models.Stock;
import synerzip.repositories.StockRepository;

@Service
public class StockService {

	@Autowired
	private StockRepository repository;

	public Stock getByID(Long id) {
		return repository.findOne(id);
	}

	public List<Stock> getList() {
		return (List<Stock>) repository.findAll();
	}

	public void save(Stock obj) {
		repository.save(obj);
	}

}
