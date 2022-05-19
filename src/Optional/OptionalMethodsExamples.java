package Optional;

import java.util.Optional;

public class OptionalMethodsExamples {

	public static void main(String[] args) {

		Optional<String> ofNullable = Optional.ofNullable("Arun");  //this method, if the data presents in method, will return same data.Like if else...
		System.out.println(ofNullable.isPresent() ? ofNullable.get() : Optional.empty());
		
		Optional<String> of = Optional.of(null);  // this method, if the data presents will return same data otherwise throw the null pointer exception
		System.out.println(of.isPresent() ? of.get() : Optional.empty());
		
		System.out.println(Optional.empty());
		
	}

}
