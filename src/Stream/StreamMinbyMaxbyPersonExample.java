package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class StreamMinbyMaxbyPersonExample {

	public static void main(String[] args) {

//		System.out.println(maxBy());
		// System.out.println(minBy());
		System.out.println(multiplePersons());

	}

	static Optional<Person> maxBy() {

		return PersonRepoDetails.getAllPersons().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Person::getHeight)));
	}

	static Optional<Person> minBy() {

		return PersonRepoDetails.getAllPersons().stream()
				.collect(Collectors.minBy(Comparator.comparing(Person::getHeight)));
	}

	static List<Person> multiplePersons() {

		List<Person> personList = new ArrayList<Person>();
		Person sinPersonList = maxBy().get(); // because it is optional data so we are using get method for normal data

		if (null != sinPersonList) {
			
			personList = PersonRepoDetails.getAllPersons().stream()
					.filter((per) -> per.getHeight() == sinPersonList.getHeight()).collect(Collectors.toList());
		}
		
		return personList;
	}

}
