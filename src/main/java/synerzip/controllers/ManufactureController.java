package synerzip.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import synerzip.models.Manufacturer;
import synerzip.services.ManufacturerService;

@RestController
public class ManufactureController {
	
	@Autowired
	private ManufacturerService manufactureService;
		
	@RequestMapping(value = "/manufacturer", method = RequestMethod.GET)
    public List<Manufacturer> getObjectList() {
     
		System.out.println("Inside get list");
		return manufactureService.getList();
    }
	
	@RequestMapping(value = "/manufacturer", method = RequestMethod.POST)
    public String createObject(@RequestBody Manufacturer obj) {
     
		System.out.println("Inside save");
		manufactureService.save(obj);
        return "Saved";
    }
	
	
}
