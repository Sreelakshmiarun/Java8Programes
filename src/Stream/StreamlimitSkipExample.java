package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamlimitSkipExample {  // here, we are printing the data's in some particular limit

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("apple","banana","cherry","mango","guva");
		fruits.stream().limit(3).forEach(System.out::println);
	
	    List<Integer> number = Arrays.asList(1,2,3,4,5,6);   // if you mention limit is 4, it is consider the 1st 4 elements   
	    int count = number.stream()
	    		.limit(3)
	    		.reduce(0, (x,y) -> x+y);
	    System.out.println(count);
	    
	    
	    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);   // here, skip is oppsite of limit,if you mention the skip is 4, it will consider after the 4th elements   
         int counts  = numbers.stream()
        		 .skip(4)
        		 .reduce(0, (x,y) -> x+y);
         System.out.println(counts);
	
	
	
	}

}
