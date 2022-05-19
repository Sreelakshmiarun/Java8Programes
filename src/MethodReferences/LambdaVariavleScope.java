package MethodReferences;

import java.util.function.Consumer;

public class LambdaVariavleScope {
	
	static int c=30;

	public static void main(String[] args) {

		int a = 10;
		Consumer<Integer> con = b -> {

			System.out.println("a is: " + a);
			System.out.println("b is: " + b);
			System.out.println("c is: " + c);
		//	a=11;   //we can't modify the local variable in inside the functional interface, lambda's consider the local variables as final variables.If we trying to modify it, getting compile time error
            c=40;
			System.out.println("c is: " + c);

            
			
		};
		con.accept(20);

	}

}
