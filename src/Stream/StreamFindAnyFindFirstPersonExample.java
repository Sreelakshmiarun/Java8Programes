package Stream;

import java.util.Optional;
import java.util.function.Predicate;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class StreamFindAnyFindFirstPersonExample {

	static Predicate<Person> heightCheck = per -> per.getHeight() >170;
	public static void main(String[] args) {
		
		Optional<Person> findAnyy = findAny();
		if(findAnyy.isPresent()) {
			System.out.println(findAnyy);
		}
		else {
			System.out.println("No records");
		}
		
		
		Optional<Person> findFirst = findFirst();
		if(findFirst.isPresent()) {
			System.out.println(findFirst);
		}
		else {
			System.out.println("No records");
		}
			 
		

	}
	
	 static Optional<Person> findAny() {
		 
		 return PersonRepoDetails.getAllPersons()
				 .stream()
				 .filter(heightCheck)
				 .findAny();
	 }
	 
	 
	 static Optional<Person> findFirst() {
		 
		 return PersonRepoDetails.getAllPersons()
				 .stream()
				 .filter(heightCheck)
				 .findFirst();
	 }

}
