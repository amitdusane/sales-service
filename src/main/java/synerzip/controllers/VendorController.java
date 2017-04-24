package synerzip.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import synerzip.models.Vendor;
import synerzip.services.VendorService;

@RestController
public class VendorController {/*

	@Autowired
	private VendorService service;
	
	@RequestMapping(value="/vendor", method=RequestMethod.GET)
	public List<Vendor> getVendors(){
		
		return service.getList();		
	}
	
	@RequestMapping(value="/vendor/{id}", method=RequestMethod.GET)
	public Vendor getObject(@PathVariable("id") Long id){
		
		return service.getByID(id);
	}
	
	@RequestMapping(value="/vendor", method=RequestMethod.POST)
	public String saveObject(@RequestBody Vendor obj){
		service.save(obj);
		return "Saved";
	}
	
*/}
