package scanned.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import scanned.data.Address;
import scanned.data.Person;
import scanned.service.ServiceMine;

@Controller
public class MainController {
	@Autowired
	private ServiceMine service;
	
	@RequestMapping("/")
	public String index() {	
		return "index";
	}

	@RequestMapping("/registrationForm")
	public String registrationForm() {		
		return "registrationForm";
	}

	@RequestMapping("/saved")
	public String register(Person person, Address address) {
		service.savePerson(person);
		service.saveAddress(address);
		return "saved";

	}
	
	@RequestMapping("/map")
	public String map(Model model) {
		List<Person> persons=service.getPersons();
		List<Address> addresses=service.getAddresses();	
		System.out.println("the list of persons"+persons);
		model.addAttribute("persons", persons);
		model.addAttribute("address", addresses);
		return "matching";

	}
	
	@RequestMapping("/mapping")
	public String mapping(Person person, Address address) {
		person.getAddress().add(address);
		service.updatePerson(person);
		return "updated";

	}

	public ServiceMine getService() {
		return service;
	}

	public void setService(ServiceMine service) {
		this.service = service;
	}	
}
