package MethodReferences;

public class MethodReferenceComstructorExample {

	private String name;

	@Override
	public String toString() {
		return "MethodReferenceComstructorExample [name=" + name + "]";
	}

	public MethodReferenceComstructorExample(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Arun arun = MethodReferenceComstructorExample::new;
		MethodReferenceComstructorExample abc = arun.dhas("ArunDhas");
		System.out.println(abc.getName());

	}

}

@FunctionalInterface
interface Arun {

	MethodReferenceComstructorExample dhas(String name);

}
