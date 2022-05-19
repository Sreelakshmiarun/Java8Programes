package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatmapExample {

	public static void main(String[] args) {

		List<Integer> oddNumber = Arrays.asList(1,3,5,7,9);
		List<Integer> evenNumber = Arrays.asList(2,4,6,8,10);
		
		List<List<Integer>> listoflist = Arrays.asList(oddNumber,evenNumber);
		System.out.println("BeforeStream: "+listoflist);
		
		List<Integer> flattenMap = listoflist
				.stream()         //stream<List<integer>>
				.flatMap(List ::stream)  //stream<Integer>
				.collect(Collectors.toList());
		System.out.println("In Stream :" +flattenMap);
		
	}

}
