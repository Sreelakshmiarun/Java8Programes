package Stream;

import java.util.Optional;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class StreamResucePersonExample {

	public static void main(String[] args) {
		heightCheck();
		
	}
	
	 static void heightCheck() {
		
		Optional<Person> personHeight = PersonRepoDetails.getAllPersons()
		.stream()
		.reduce((x,y) -> x.getHeight() > y.getHeight() ? x : y);
		System.out.println(personHeight.get());
	}

}
