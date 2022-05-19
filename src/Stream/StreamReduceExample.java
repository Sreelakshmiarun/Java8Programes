package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Optional<Integer> sum = list.stream().reduce((a,b) ->a+b);      // This reduce method is return optional data
		System.out.println(sum);
		System.out.println(sum.get());    //here, we getting optional data as "optional[15]", if using get method, will get normal data
		
		int sum1 = list.stream().mapToInt(i -> i).sum(); //maptoint is used to convert the data from wrapper to primitive integer
		System.out.println(sum1);
	}

}
