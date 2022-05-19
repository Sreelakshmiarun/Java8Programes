package Java8FunInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> biPredicate = (a,b) -> a>=50 && b<50;
		boolean result = biPredicate.test(50, 59);
		System.out.println(result);
		

	}

}
