package hashCodeEqualsAndInheritanceExample;

//The class Employee inherits the attributes and methods in class Person.
public class Employee extends Person {

	private long salary = 2000; //Adding an attribute that does not appear in Person.

	public Employee() {
		//The Person() empty CTOR is also invoked here.
		System.out.println("CTOR Employee");
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {

		if (salary >= 2000) {
			this.salary = salary;
		}

	}

	public String getDetails() {
		return super.getDetails() + ", Salary: " + salary;
	}

}
