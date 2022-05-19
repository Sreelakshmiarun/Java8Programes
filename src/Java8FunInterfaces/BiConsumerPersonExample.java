package Java8FunInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class BiConsumerPersonExample {
	
	static List<Person> list = PersonRepoDetails.getAllPersons();
	static BiConsumer<String, List<String>> bc1 = (name,hobbies) -> System.out.println("Name:"+ name +" /Hobbies: "+ hobbies);
	static BiConsumer<String, Double> bc2 =  (name,salary) -> System.out.println("Name:"+ name + " /Salary:"+salary);
			
	public static void main(String[] args) {
		
		//fetchHobbies();
		fetchSalary();
	}
	
	static void fetchHobbies() {
		
		list.forEach(per -> {
			
			bc1.accept(per.getName(), per.getHobbies());
			
		});
	}
	
	static void fetchSalary() {
		list.forEach(per -> {
			
			bc2.accept(per.getName(), per.getSalary());
			
		});
	}

}
