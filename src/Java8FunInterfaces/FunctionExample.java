package Java8FunInterfaces;

import java.util.function.Function;

public class FunctionExample {  //this interface has 2 parameters, one is input parameter data type, another is output parameter data type.

	public static void main(String[] args) {

		Function<String, Integer> fun = a -> a.length();
		Function<String, String> funn = a -> a.toUpperCase();
		String funny = funn.apply("Arun Dhas");
		System.out.println(funny);
		
	}

}
