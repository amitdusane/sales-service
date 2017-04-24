package synerzip.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import synerzip.models.Sales;
import synerzip.services.SalesService;

@RestController
public class SalesController {

	@Autowired
	private SalesService service;
	
	@RequestMapping(value="/sales", method=RequestMethod.GET)
	public List<Sales> getVendors(){
		
		return service.getList();		
	}
	
	@RequestMapping(value="/sales/{id}", method=RequestMethod.GET)
	public Sales getObject(@PathVariable("id") Long id){
		
		return service.getByID(id);
	}
	
	@RequestMapping(value="/sales", method=RequestMethod.POST)
	public String saveObject(@RequestBody Sales obj){
		service.save(obj);
		return "Saved";
	}
	
}
