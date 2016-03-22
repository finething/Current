package scanned.dao;

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
	
	@Transactional(propagation=Propagation.MANDATORY)
	public void savePerson(Person person){
		sessionFactory.getCurrentSession().save(person);
	}
	
	@Transactional(propagation=Propagation.MANDATORY)
	public void savePerson(Address address){
		sessionFactory.getCurrentSession().save(address);
	}

}
