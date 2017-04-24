package synerzip.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import synerzip.models.SalesDetails;
import synerzip.services.SalesDetailsService;

@RestController
public class SalesDetailsController {

	@Autowired
	private SalesDetailsService salesDetailsService;
	
	@RequestMapping(value="/salesDetails", method=RequestMethod.GET)
	public List<SalesDetails> getProducts(){
		
		return salesDetailsService.getList();		
	}
	
	@RequestMapping(value="/salesDetails/{id}", method=RequestMethod.GET)
	public SalesDetails getProducts(@PathVariable("id") Long id){
		
		return salesDetailsService.getByID(id);
	}
	
	@RequestMapping(value="/salesDetails", method=RequestMethod.POST)
	public String saveProduct(@RequestBody SalesDetails salesDetails){
		salesDetailsService.save(salesDetails);
		return "Saved";
	}
	
}
