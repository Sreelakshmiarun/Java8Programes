package Stream;

import java.util.Comparator;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class StreamCustomSortPersonExample {

	public static void main(String[] args) {
		
		System.out.println("sort the person details by name");
		PersonRepoDetails.getAllPersons()
		.stream()
		.sorted(Comparator.comparing(Person :: getName ))    //stream<Person>
		//.forEach(per -> System.out.println(per))
		.forEach(System.out :: println);       //Using method reference for println
		
		
		System.out.println("sort the person details by height");
		PersonRepoDetails.getAllPersons()
		.stream()
		.sorted(Comparator.comparing(Person :: getHeight))
		.forEach(System.out::println);
		
		
		System.out.println("Sort the person details by height as reversed");
		PersonRepoDetails.getAllPersons()
		.stream()
		.sorted(Comparator.comparing(Person :: getHeight).reversed())
		.forEach(System.out::println);
		
	}

}
