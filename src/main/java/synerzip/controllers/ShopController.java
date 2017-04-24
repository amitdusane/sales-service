package synerzip.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import synerzip.models.Shop;
import synerzip.services.ShopService;

@RestController
public class ShopController {

	@Autowired
	private ShopService service;
	
	@RequestMapping(value="/shop", method=RequestMethod.GET)
	public List<Shop> getVendors(){
		
		return service.getList();		
	}
	
	@RequestMapping(value="/shop/{id}", method=RequestMethod.GET)
	public Shop getObject(@PathVariable("id") Long id){
		
		return service.getByID(id);
	}
	
	@RequestMapping(value="/shop", method=RequestMethod.POST)
	public String saveObject(@RequestBody Shop obj){
		service.save(obj);
		return "Saved";
	}
	
}
