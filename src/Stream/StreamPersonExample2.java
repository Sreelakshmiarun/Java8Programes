package Stream;

import java.util.List;
import java.util.stream.Collectors;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class StreamPersonExample2 {

	public static void main(String[] args) {

		List<String> personHobbies =  PersonRepoDetails.getAllPersons()  //list of person
				.stream()         //stream of persoon
				.map(Person :: getHobbies)            //Stream<List<String>>
				.flatMap(List :: stream)    // Stream<String>
				.distinct()
				.collect(Collectors.toList());
		System.out.println("PersonHobbies:" +personHobbies);
		
	}

}
