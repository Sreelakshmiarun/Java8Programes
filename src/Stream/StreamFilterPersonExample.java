package Stream;


import java.util.function.Predicate;
import java.util.stream.Collectors;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class StreamFilterPersonExample {

	static Predicate<Person> heightCheck = per -> per.getHeight() > 170;
	static Predicate<Person> genderCheck = per -> per.getGender().equals("Male");
	
	public static void main(String[] args) {
		
		PersonRepoDetails.getAllPersons()
				.stream()
				.filter(heightCheck.and(genderCheck))
				//.filter(genderCheck)
				.collect(Collectors.toList()).forEach(System.out::println);
				

	}

}
