package synerzip.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import synerzip.models.Vendor;
import synerzip.services.GenericService;

@RestController
public class GenericController {

	@Autowired
	private GenericService service;
	
	@RequestMapping(value="/vendor", method=RequestMethod.GET)
	public List<Vendor> getVendors(){
		
		return service.getList();		
	}
	
	@RequestMapping(value="/{from}/{id}", method=RequestMethod.GET)
	public Object getObject(@PathVariable("from") String from, @PathVariable("id") Long id){
		
		return service.getByID(from, id);
	}
	
	@RequestMapping(value="/vendor", method=RequestMethod.POST)
	public String saveObject(@RequestBody Vendor obj){
		service.save(obj);
		return "Saved";
	}
	
}
