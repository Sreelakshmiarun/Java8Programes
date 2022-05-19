package Stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class StreamPersonExample {
	
	//static Predicate<Person> heightCheck = per -> per.getHeight() >=170;
	//static Predicate<Person> genderCheck = per -> per.getGender().equals("Male");

	public static void main(String[] args) {
		Predicate<Person> heightCheck = per -> per.getHeight() >=170;
		 Predicate<Person> genderCheck = per -> per.getGender().equals("Male");

		Map<String,List<String>> map = PersonRepoDetails.getAllPersons()
				.stream()
				//.filter(per -> per.getHeight() >=170 )
				//.filter(heightCheck)
				//.filter(per -> per.getGender().equals("Male"))
				//.filter(genderCheck)
				.filter(heightCheck.and(genderCheck))
				.collect(Collectors.toMap(Person :: getName, Person :: getHobbies));
		System.out.println(map);
		
	}

}
