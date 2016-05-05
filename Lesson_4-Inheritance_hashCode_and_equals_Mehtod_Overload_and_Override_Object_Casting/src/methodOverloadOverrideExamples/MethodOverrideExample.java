package methodOverloadOverrideExamples;

import hashCodeEqualsAndInheritanceExample.Employee;
import hashCodeEqualsAndInheritanceExample.Person;

public class MethodOverrideExample {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("David", 25);
		System.out.println(p1.getDetails());
		
		Employee emp = new Employee();
		System.out.println(emp.getDetails());
		
		
	}

}
