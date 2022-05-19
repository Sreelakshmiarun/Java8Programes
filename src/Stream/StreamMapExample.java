package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("Apple","Banana","Carrot","Guva");
		
		List<Integer> intFruits = fruits
				.stream()
				.map(String :: length)
				.collect(Collectors.toList());
		System.out.println("length of Fruits:" +intFruits);
		
	}

}
