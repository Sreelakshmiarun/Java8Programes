package Java8FunInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class BiFunctionPersonExample {

	public static void main(String[] args) {

		Predicate<Person> heightCheck = (a -> a.getHeight() >= 160);
		Predicate<Person> genderCheck = (a -> a.getGender().equals("Male"));
		BiFunction<List<Person>, Predicate<Person>, Map<String, Double>> bf1 = (list, predicate) -> {
			Map<String, Double> map = new HashMap<>();
			list.forEach(per -> {
				if (predicate.test(per)) {
					map.put(per.getName(), per.getSalary());
				}
			});
			return map;

		};
		
		List<Person> list = PersonRepoDetails.getAllPersons();
		Map<String,Double> map = bf1.apply(list, genderCheck);
		System.out.println(map);

	}

}
