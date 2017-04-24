package synerzip.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import synerzip.models.Product;
import synerzip.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/product", method=RequestMethod.GET)
	public List<Product> getProducts(){
		
		return productService.getList();		
	}
	
	@RequestMapping(value="/product/{id}", method=RequestMethod.GET)
	public Product getProducts(@PathVariable("id") Long id){
		
		return productService.getByID(id);
	}
	
	@RequestMapping(value="/product", method=RequestMethod.POST)
	public String saveProduct(@RequestBody Product prod){
		productService.save(prod);
		return "Saved";
	}
	
}
