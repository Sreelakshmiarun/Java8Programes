package MethodReferences;

import java.util.Comparator;

public class MethodRefer {

	public static void main(String[] args) {
		
		Comparator<Integer> comp = (a,b) -> compare(a,b);     //lambda
		System.out.println(comp.compare(10, 20));
		
		Comparator<Integer> comp1 = MethodRefer :: compare;   //Method Reference
		System.out.println(comp1.compare(30, 20));

	}
	
	public static int compare(int a, int b) {
		
		return Integer.compare(a, b);
	}

}
