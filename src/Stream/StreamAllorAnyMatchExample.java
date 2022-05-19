package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class StreamAllorAnyMatchExample {

	static Predicate<String> fru = a -> a.length() >3;
	static Predicate<String> fruu = b -> b.length() >7;	
	static Predicate<Person> heightCheck = per -> per.getHeight() >170;
	
	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("apple","banana","pineapple","guva","mango");
        System.out.println("All Match :" + fruits.stream().allMatch(fru));  //here,we checking the mentioned length in all data's
        System.out.println("Any Match :" + fruits.stream().anyMatch(fruu)); //here,we checking the mentioned length in any one's data

        boolean height = PersonRepoDetails.getAllPersons()
        		.stream()
        		.allMatch(heightCheck);
                //.anyMatch(heightCheck);  
        System.out.println(height);
        
	}

}
