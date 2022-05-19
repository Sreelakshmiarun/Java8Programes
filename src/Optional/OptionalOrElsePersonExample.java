package Optional;

import java.util.Optional;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class OptionalOrElsePersonExample {

	public static void main(String[] args) {

		//orElse();
		//orElseGet();
		orElseThrow();
		
	}
	
	static void orElse() {
	Optional<Person> person = PersonRepoDetails.getPersonalOptionaal(); 
	//Optional<Person> person1 = Optional.of(new Person());
	String name = person.map(Person :: getName).orElse("No records");  //here, orElse is used to if no data in your mentioned DTO, it will take care and return the error message 
	System.out.println(name);
	
	}
	
	static void orElseGet() {
		
		Optional<Person> person1 = PersonRepoDetails.getPersonalOptionaal();
		String name = person1.map(Person :: getName).orElseGet(() -> {			
			return "No records found";			
		});
		
		System.out.println(name);
	}
	
	static void orElseThrow() {
		Optional<Person> person3 = PersonRepoDetails.getPersonalOptionaal();
		String name = person3.map(Person :: getName).orElseThrow(() -> new RuntimeException("No Records Found..."));
		
		System.out.println(name);
	}

}
