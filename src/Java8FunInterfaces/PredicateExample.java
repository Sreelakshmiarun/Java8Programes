package Java8FunInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<Integer> greaterThan = x -> x>15;
		Predicate<Integer> lessThan = y -> y<20;
		Predicate<Integer> equalsTo = z -> z==15;
		/*
		 * boolean result = greaterThan.test(20); System.out.println(result);
		 */
		
		System.out.println(greaterThan.and(lessThan).test(19));
		System.out.println(greaterThan.or(lessThan).test(21));
		System.out.println(greaterThan.and(equalsTo).test(15));
		
	}

}
