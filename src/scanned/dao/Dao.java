package scanned.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import scanned.data.Address;
import scanned.data.Person;

public class Dao {

	private SessionFactory sessionFactory;

	public Dao() {

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public void savePerson(Person person) {
		sessionFactory.getCurrentSession().save(person);
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public void savePersonList(List<? extends Person> input) {
		for (Person person : input) {
			sessionFactory.getCurrentSession().save(person);
		}
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public void saveAddress(Address address) {
		sessionFactory.getCurrentSession().save(address);
	}
	
	@Transactional(propagation = Propagation.MANDATORY)
	public void saveAddressess(List<? extends Address> addressess) {
		for (Address address : addressess) {
		sessionFactory.getCurrentSession().save(address);
		}
	}
	
	@Transactional(propagation = Propagation.MANDATORY)
	public void updatePerson(Person person) {
		sessionFactory.getCurrentSession().update(person);
	}
	
	@Transactional(propagation = Propagation.MANDATORY)
	public List<Person> getPersons() {
		String queryString="from Person";
		Query query=sessionFactory.getCurrentSession().createQuery(queryString);
		return query.list();		 
	}
	
	@Transactional(propagation = Propagation.MANDATORY)
	public List<Address> getAddressess() {
		String queryString="from Address";
		Query query=sessionFactory.getCurrentSession().createQuery(queryString);
		return query.list();		 
	}

}
