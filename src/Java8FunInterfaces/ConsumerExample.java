package Java8FunInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> c1 = (a) -> System.out.println(a.toUpperCase());
		// c1.accept("java8 features");
		Consumer<String> c2 = (a) -> System.out.println(a.toLowerCase());

		c1.andThen(c2).accept("ArunDhas"); // andThen is the default method in Consumer Interface.If you used same type
											// of data types, we can use andThen method like this....

	}

}
