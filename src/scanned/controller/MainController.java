package scanned.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import scanned.data.Address;
import scanned.data.Person;
import scanned.service.ServiceMine;


@Controller
public class MainController {
	@Autowired
	private ServiceMine service;
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/registrationForm")
	public String registrationForm(){
		return "registrationForm";
	}
	
	@RequestMapping(value="/saved", method = RequestMethod.POST)
	public String register(Person person, Address address){
		service.savePerson(person);
		service.saveAddress(address);
		return "saved";
		
	}

	public ServiceMine getService() {
		return service;
	}

	public void setService(ServiceMine service) {
		this.service = service;
	}
	
	

}