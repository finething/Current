package scanned.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import scanned.dao.Dao;
import scanned.data.Address;
import scanned.data.Person;

@org.springframework.stereotype.Service
public class ServiceMine {

	private Dao dao;
	
	public ServiceMine() {
	}

	public Dao getDao() {
		return dao;
	}

	@Autowired
	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void savePerson(Person person) {
		dao.savePerson(person);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void savePersonList(List<? extends Person> input) {
		dao.savePersonList(input);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void saveAddress(Address address) {
		dao.saveAddress(address);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void saveAddressess(List<? extends Address> addressess) {
		dao.saveAddressess(addressess);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updatePerson(Person person) {
		dao.updatePerson(person);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Person> getPersons() {
		return dao.getPersons();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Address> getAddresses() {
		return dao.getAddressess();
	}
}
