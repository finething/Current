package scanned.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import scanned.data.Person;
import scanned.service.ServiceMine;

public class Writer implements ItemWriter<Person> {
	
	private ServiceMine service;

	public ServiceMine getService() {
		return service;
	}

	public void setService(ServiceMine service) {
		this.service = service;
	}

	@Override
	public void write(List<? extends Person> input) throws Exception {
		service.savePersonList(input);		
	}

}
