package StreamFactory;

import java.util.Random;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamFactoryExample {

	static UnaryOperator<Integer> u0 = x -> x+5;
	public static void main(String[] args) {

	//	Stream<Integer> s1 = Stream.iterate(0, x -> x+5).limit(10);
		Stream<Integer> s1 = Stream.iterate(0, u0).limit(10);
		//s1.forEach(System.out::println);
		
		Stream<Double> s2 = Stream.generate(() -> Math.random()).limit(10);
		s2.forEach(System.out::println);
		
		Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
		
		Stream<String> numbers =Stream.of("one","two","five","Three","four");
		numbers.forEach(System.out::println);
	}

}
