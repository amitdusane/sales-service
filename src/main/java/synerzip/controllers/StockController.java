package synerzip.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import synerzip.models.Stock;
import synerzip.services.StockService;

@RestController
public class StockController {

	@Autowired
	private StockService service;
	
	@RequestMapping(value="/stock", method=RequestMethod.GET)
	public List<Stock> getAll(){
		
		return service.getList();		
	}
	
	@RequestMapping(value="/stock/{id}", method=RequestMethod.GET)
	public Stock getObject(@PathVariable("id") Long id){
		
		return service.getByID(id);
	}
	
	@RequestMapping(value="/stock", method=RequestMethod.POST)
	public String saveObject(@RequestBody Stock obj){
		service.save(obj);
		return "Saved";
	}
	
}
