package Java8FunInterfaces;

import java.util.List;
import java.util.function.BiPredicate;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class BiPredicatePersonExample {

	public static void main(String[] args) {

		BiPredicate<Integer, String> personCheck = (height, gender) -> (height > 170 && gender.equals("Male"));
		List<Person> list = PersonRepoDetails.getAllPersons();
		list.forEach(per -> {

			if (personCheck.test(per.getHeight(), per.getGender())) {

				System.out.println(per);
			}

		});

	}

}
