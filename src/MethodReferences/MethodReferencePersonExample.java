package MethodReferences;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

import StudentRepo.Person;
import StudentRepo.PersonRepoDetails;

public class MethodReferencePersonExample {
	
	static Predicate<Person> heightCheckk = MethodReferencePersonExample :: heightCheck;  //In static method we can access with classname::methodname
	//static Predicate<Person> heightCheckk = per -> MethodReferencePersonExample.heightCheck();

	static BiPredicate<Person, Integer> heightCheckWithParamm = MethodReferencePersonExample :: heightCheckWithParam;
	

	public static void main(String[] args) {

		System.out.println(heightCheckk.test(PersonRepoDetails.getPerson()));
		System.out.println(heightCheckWithParam(PersonRepoDetails.getPerson(), 160));
		MethodReferencePersonExample obj = new MethodReferencePersonExample(); //In not-static method we can't call classname::methodname, but we can use after object creation for class after that able to call as class object :: method name
		Function<String, String> printNamee = obj ::printName;
		System.out.println(printNamee.apply("Arundhas"));
		
	}

	public static boolean heightCheck(Person per) {
		
		return per.getHeight() >= 166;
	}
	
	public static boolean heightCheckWithParam(Person per,Integer height) {
		
		return per.getHeight() >= height;
	}
	
	String printName(String name) {
		return ("Hello "+name);
	}
}
