package hashCodeEqualsAndInheritanceExample;

public class EmployeeTest {

	public static void main(String[] args) {

		Person p = new Person();
		System.out.println(p.getDetails());
		Employee e = new Employee();
		System.out.println(e.getDetails()); //The same details of p are printed with the addition of the salary attribute.

		p.setName("Yosi");
		p.setAge(22);
		System.out.println(p.getDetails());

		e.setName("David");
		e.setAge(33);
		
		System.out.println(e.getDetails());
		System.out.println(e.getSalary());
	}

}
