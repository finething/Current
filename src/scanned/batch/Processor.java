package scanned.batch;

import org.springframework.batch.item.ItemProcessor;

import scanned.data.Person;

public class Processor implements ItemProcessor<Person, Person>{

	@Override
	public Person process(Person input) throws Exception {
		
		return input;
	}

}
