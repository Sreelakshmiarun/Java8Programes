package Java8FunInterfaces;

import java.util.List;
import java.util.function.Consumer;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class ConsumerPersonExample {

	static Consumer<Person> c1 = per -> System.out.println(per); // here, "per" is just reference name
	static Consumer<Person> c2 = per -> System.out.println(per.getName().toUpperCase());
	static List<Person> list = PersonRepoDetails.getAllPersons();

	public static void main(String[] args) {

		printWithCondition();

		// list.forEach(c1);
		// list.forEach(c2);
		// list.forEach(c1.andThen(c2));
	}

	static void printWithCondition() {

		list.forEach(per -> {
			if (per.getGender().equals("Male") && per.getHeight() >= 175) {

				c1.andThen(c2).accept(per);
				//System.out.println(per.getName());
			}

		});

	}

}
