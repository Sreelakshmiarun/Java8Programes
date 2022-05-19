package Stream;

import java.util.stream.Stream;

public class SimpleStreamExample {

	public static void main(String[] args) {

		Stream<Integer> a = Stream.of(0,1,2,3,4,5);     //This is the simple Stream example
		a.forEach(b -> System.out.println(b));
		
		Integer arr[] = new Integer[] {1,2,3,5,6,7,8,9,10};   //Convert the existing data into Stream data example
		Stream<Integer> b = Stream.of(arr);
		b.forEach(c -> System.out.println(c));
	}

}
