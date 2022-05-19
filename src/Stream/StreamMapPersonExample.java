package Stream;

import java.util.List;
import java.util.stream.Collectors;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class StreamMapPersonExample {

	public static void main(String[] args) {

		List<String> personNameUppercase = PersonRepoDetails.getAllPersons()
				.stream()
				//.map(s -> s.getName().toUpperCase())
				.map(Person :: getName)   //getting name's string
				.map(String :: toUpperCase)
				.collect(Collectors.toList());
		System.out.println(personNameUppercase);
				
		
	}

}
