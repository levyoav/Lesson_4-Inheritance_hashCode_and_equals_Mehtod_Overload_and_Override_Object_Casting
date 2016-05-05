package hashCodeEqualsAndInheritanceExample;

public class PersonTest {

	public static void main(String[] args) {

		Person p1 = new Person();
		// p1.name = "Y";
		// p1.age = 4000;

		p1.setName("Yosi");
		p1.setAge(25);
		
		p1.setAge(200);

		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		System.out.println(p1.getDetails());
	}

}
