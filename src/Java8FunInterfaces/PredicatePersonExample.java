package Java8FunInterfaces;

import java.util.List;
import java.util.function.Predicate;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class PredicatePersonExample {
	
	static Predicate<Person> heightCheck = per -> per.getHeight() > 175 ;
	static Predicate<Person> genderCheck = per -> per.getGender().equals("Male") ;

	public static void main(String[] args) {
		
		List<Person> list = PersonRepoDetails.getAllPersons();
		list.forEach(per -> {
			if(heightCheck.and(genderCheck).test(per)) {
				System.out.println(per.getName());
			}
			
		});

	}

}
