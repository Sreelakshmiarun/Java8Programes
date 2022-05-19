package Java8FunInterfaces;

import java.util.List;
import java.util.function.Supplier;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class SupplierPersonExample {   // supplier interface doesn't have parameter

	public static void main(String[] args) {

		Supplier<List<Person>> supp1 = () -> PersonRepoDetails.getAllPersons();
		Supplier<Person> supp2 = () -> PersonRepoDetails.getPerson();
		
		System.out.println(supp1.get());
		System.out.println(supp2.get());
	
	}

}
