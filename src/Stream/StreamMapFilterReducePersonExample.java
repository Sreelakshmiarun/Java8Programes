package Stream;

import java.util.function.Predicate;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class StreamMapFilterReducePersonExample {
	
	
	
	static Predicate<Person> heightCheck = (per) -> (per.getHeight()>170);
	static Predicate<Person> genderCheck = (per) -> (per.getGender().equals("Male"));

	public static void main(String[] args) {

		System.out.println("requirement is get all the kids count of greater than 170 height of male persons");
		int count = PersonRepoDetails.getAllPersons()
				.stream()
				.filter(heightCheck.and(genderCheck))
				.map(Person :: getKids)
				.reduce(0, (x,y) -> x+y);
		System.out.println(count);
	}

}
