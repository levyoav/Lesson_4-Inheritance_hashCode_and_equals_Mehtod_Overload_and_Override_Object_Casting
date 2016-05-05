package objectCastingExamples;

import hashCodeEqualsAndInheritanceExample.Employee;
import hashCodeEqualsAndInheritanceExample.Person;

public class ObjectCastingExample2 {

	public static void main(String[] args) {
		//An array of objects of type Person or of Person subclasses (Employee).  
		Person[] persons = { new Person("David", 44), new Employee(), new Person() };

		//Iterating over the array and getting either a Person or an Employee object...
		for (int i = 0; i < persons.length; i++) {
			//These 2 lines are safe since the methods getName() and getAge() are defined in class Person and are inherited by Employee class.
			//So it is possible to invoke them from any object of the array weather it is a Person or an Employee object.
			System.out.println(persons[i].getName());
			System.out.println(persons[i].getAge());

			//Checking if the current object is of Employee type.
			if (persons[i] instanceof Employee) {
				Employee e = (Employee) persons[i]; //Casting to Employee type.
				System.out.println(e.getSalary()); //Only after verifying that the object is of type Employee, it is safe to invoke getSalary.
			}

			System.out.println("==========");
		}
	}
}
