package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

	public static void main(String[] args) {

		System.out.println("Requirment : we need names if name length is greater than 5");
		
		List<String> names = Arrays.asList("arun","raj","siva","maharajan","nayanthara","samantha");
		List<String> updateName = names
				.stream()
				.filter(n -> n.length()>5)
				.collect(Collectors.toList());
		System.out.println("The Updated list is :" + updateName);
				
	}

}
