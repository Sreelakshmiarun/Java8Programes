package Java8FunInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class FunctionPersonalExample {
	
	static Predicate<Person> heightCheck = per -> per.getHeight() >=170;
	static Predicate<Person> genderCheck = per -> per.getGender().equals("Male");
	static Function<List<Person>, Map<String,Double>> funct = list -> {
		
		Map<String,Double> map = new HashMap<>();
		
		list.forEach((per) -> {
			if(heightCheck.and(genderCheck).test(per)) {
				
				map.put(per.getName(), per.getSalary());
			}
			
			
		});
		return map;
		
		
	};
	public static void main(String[] args) {
		
		List<Person> list = PersonRepoDetails.getAllPersons();
		System.out.println(funct.apply(list));

		
	}

}