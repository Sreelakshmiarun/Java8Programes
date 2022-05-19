package Java8FunInterfaces;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {

		BiFunction<String, String, String> bf1 = (a,b) -> a.concat(b);
		System.out.println(bf1.apply("Arun", " Dhas"));
	}

}
