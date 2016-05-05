package objectCastingExamples;

import hashCodeEqualsAndInheritanceExample.Employee;
import hashCodeEqualsAndInheritanceExample.Person;

public class ObjectCastingExample {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Employee(); //p2 is a Person type reference to an Employee object. An Employee is necceseraly a Person.
		
		//Since p2 is of a Person type, it does not have a getSalary() method since there was no such method defined in the Person class.
		//Only in Employee class. So this line will give an error.
//		 System.out.println(p2.getSalary());

		//The object referenced by p1 is an instance of Person, not Employee.
		if (p1 instanceof Employee) {
			Employee e = (Employee) p1; // casting
			System.out.println(e.getSalary());
		}
		
		//The object referenced by p2 is an instance of Employee.
		if (p2 instanceof Employee) {
			//Since it was verified that p2 is a reference to an Employee object, it is safe to cast p2 to be 
			//an Employee type reference. 
			Employee e = (Employee) p2; // casting
			System.out.println(e.getSalary()); //The casting enables the use of the getSalary() method.
		}
		
		System.out.println();
		
		//The compiler will allow to cast p1 to be an Employee type reference. But during runtime, a ClassCastException is thrown.
		//This is because p1 is not a reference to an Employee object.
		Employee e1 = (Employee)p1; //The exception is already thrown here. Not when invoking the method. 
		e1.getSalary();
		
		//This is obviously illegal since there is no relationship between int Person and Employee.
//		e1 = (int)p1;
		
	}
}
