package scanned.batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import scanned.data.Person;

public class Mapper implements FieldSetMapper<Person> {

	@Override
	public Person mapFieldSet(FieldSet input) throws BindException {
		Person person = new Person();
		person.setFirstName(input.readString(0));
		person.setLastName(input.readString(1));
		person.setMiddleName(input.readString(2));
		person.setSsn(input.readString(3));
		person.setAge(input.readInt(4));
		return person;

	}

}
