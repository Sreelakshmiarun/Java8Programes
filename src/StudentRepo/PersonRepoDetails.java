package StudentRepo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PersonRepoDetails {
	
	public static List<Person> getAllPersons () {
		
		Person p1 = new Person("Arun",165,30000,"Male",5, Arrays.asList("cricket","hockey","swimming","running"));
		Person p2 = new Person("Raj",181,22000,"Male",2, Arrays.asList("cricket","boxing","shooting","running"));
		Person p3 = new Person("Maharajan",179,12000,"Male",2, Arrays.asList("cricket","learning","swimming","jogging"));
		Person p4 = new Person("Siva",178,25000,"Male",1, Arrays.asList("cricket","riding","swimming","running"));
		Person p5 = new Person("Dhas",167,35000,"Male",3, Arrays.asList("reading","fighting","swimming","walking"));
		Person p6 = new Person("Nayanthara",181,95000,"Female",1, Arrays.asList("acting","dubing","singing","dancing"));


		return Arrays.asList(p1,p2,p3,p4,p5,p6);
	}
		
		public static Person getPerson() {	
			return new Person("Dhas",167,35000,"Male",3, Arrays.asList("reading","fighting","swimming","walking"));
		}
		
		public static Optional<Person> getPersonalOptionaal() {
			Person per = getPerson();
			per.setAddress(Optional.of(new Address("7th block", "Vickramasingapuram", "Tamilnadu", "India", 627425)));
			return Optional.of(per);
			
		}
	}

