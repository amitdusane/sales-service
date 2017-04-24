package synerzip.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import synerzip.models.Customer;
import synerzip.services.CustomerService;

@RestController
public class CustomerController {/*

	@Autowired
	private CustomerService service;
	
	@RequestMapping(value="/customer", method=RequestMethod.GET)
	public List<Customer> getVendors(){
		
		return service.getList();		
	}
	
	@RequestMapping(value="/customer/{id}", method=RequestMethod.GET)
	public Customer getObject(@PathVariable("id") Long id){
		
		return service.getByID(id);
	}
	
	@RequestMapping(value="/customer", method=RequestMethod.POST)
	public String saveObject(@RequestBody Customer obj){
		service.save(obj);
		return "Saved";
	}
	
*/}
