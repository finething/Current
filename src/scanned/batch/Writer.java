package scanned.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import scanned.data.Person;

public class Writer implements ItemWriter<Person> {

	@Override
	public void write(List<? extends Person> input) throws Exception {
		System.out.println(input.toString());		
	}

}
