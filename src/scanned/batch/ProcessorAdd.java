package scanned.batch;

import org.springframework.batch.item.ItemProcessor;

import scanned.data.Address;

public class ProcessorAdd implements ItemProcessor<Address, Address>{

	@Override
	public Address process(Address address) throws Exception {
		// TODO Auto-generated method stub
		return address;
	}

}
