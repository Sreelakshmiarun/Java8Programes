package Java8FunInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {     //this class will take 2 inputs

	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> bc1 = (x,y) -> System.out.println("Add:"+(x+y));
		BiConsumer<Integer, Integer> bc2 = (x,y) -> System.out.println("Substraction:"+(x-y));
		
		//bc1.accept(5, 10);
		//bc2.accept(10, 5);
		//bc1.andThen(bc2).accept(9, 10);
		
		List<Integer> l1 = Arrays.asList(1,2,3,4);
		List<Integer> l2 = Arrays.asList(1,2,3,7);
		
		BiConsumer<List<Integer>, List<Integer>> bc3 = (list1, list2) -> {
			
			if(list1.size()==list2.size()) {
				System.out.println("True");
				}
			else {
				System.out.println("False");
			}
			
		};
		bc3.accept(l1, l2);
		
	}

}
