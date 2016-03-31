package scanned.batch;

import java.util.Arrays;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import scanned.data.Address;

public class MapperAdd implements FieldSetMapper<Address> {

	@Override
	public Address mapFieldSet(FieldSet fields) throws BindException {
		Address address = new Address();
		String[] separateAdd=getProperAddress(fields.readString(0));		
		address.setHouseNumber(Long.parseLong(separateAdd[0]));
		address.setStreetName(separateAdd[1]);
		address.setCity(fields.readString(1));
		address.setState(fields.readString(2));
		address.setZipCode(fields.readString(3));
		return address;
	}
	
	public String[] getProperAddress(String in){
		StringBuilder builder=new StringBuilder();
		int i=0;
		while(Character.isDigit(in.charAt(i))){
			builder.append(in.charAt(i));
			i++;
		}
		String[] response=new String[2];
		response[0]=builder.toString();
		response[1]=in.substring(i);
		return response;
	}

}
