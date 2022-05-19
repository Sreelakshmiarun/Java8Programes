package Stream;

import java.util.List;
import java.util.stream.Collectors;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class StreamFlatmapPersonExample {

	public static void main(String[] args) {

		List<String> personHobbies = PersonRepoDetails.getAllPersons()
				.stream()
				.map(Person :: getHobbies)    //stream<List<String>>
				.flatMap(List :: stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		System.out.println("PersonhobbiesUsingFlatmap :" + personHobbies);
		
		
		long countPersonHobbies = PersonRepoDetails.getAllPersons()
				.stream()
				.map(Person :: getHobbies)    //stream<List<String>>
				.flatMap(List :: stream)
				.distinct()
				.sorted()
				.count();
		System.out.println("CountPersonhobbiesUsingFlatmap :" + countPersonHobbies);
	}

}
