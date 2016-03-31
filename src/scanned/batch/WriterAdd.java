package scanned.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import scanned.data.Address;
import scanned.service.ServiceMine;

public class WriterAdd implements ItemWriter<Address> {
	
	private ServiceMine service;

	@Override
	public void write(List<? extends Address> addressess) throws Exception {
		service.saveAddressess(addressess);
		
	}

	public ServiceMine getService() {
		return service;
	}

	public void setService(ServiceMine service) {
		this.service = service;
	}
}
