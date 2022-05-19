import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DublicateString {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("arun", "raj", "siva", "maharaja", "arun");
		System.out.println(names);
		List<String> uniquelist = new ArrayList<String>();
		for (String name : names) {

			if (!uniquelist.contains(name)) {
				uniquelist.add(name);
			}

		}
		System.out.println(uniquelist);
		
	//------------------------------------------java 8----------------------------------------------------------------//	
		
		
		List<String> namess = Arrays.asList("mariadhas","usha","arun","aravinth","aswathy","arun","aswathy");
		List<String> uniquelist1 = namess.stream().distinct().collect(Collectors.toList());
		System.out.println(uniquelist1);

	}

}
