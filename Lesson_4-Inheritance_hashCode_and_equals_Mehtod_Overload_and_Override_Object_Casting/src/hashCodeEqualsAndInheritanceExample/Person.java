package hashCodeEqualsAndInheritanceExample;

public class Person {

	// attributes
	private String name;
	private int age;

	public Person() {
		//Invoking the CTOR from this class that receives a String and an int as parameters.
		this("default", 18);
	}

	public Person(String name) {
		this(name, 18);
	}

	public Person(int age) {
		this("default", age);
	}

	public Person(String name, int age) {
		//Explicitly Invoking the empty CTOR of the super class. In this case, the super class is Object. This is
		//done implicitly in every CTOR of every class (Except Object) unless stated otherwise.
		super();
		this.name = name;
		this.age = age;
	}

	// getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {

		if (name.length() >= 2 && name.length() <= 20) {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if (age >= 0 && age <= 120) {
			this.age = age;
		}
	}

	public String getDetails() {
		String details = "Name: " + name + ", Age: " + age;
		return details;
	}

	//In order to implement the equals() method, the hashCode() method must also be implemented.
	//It returns an int value that is unique for each object. This int is actually a key for when the object
	//is stored/lookedup into/from a HashTable, HashMap or HasSet.
	//
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	//Checks if the given object is equal to this object. Mostly used for when the object is stored in a collection.
	public boolean equals(Object obj) {
		if (this == obj)
			return true; //If the given object is this object return true.
		if (obj == null)
			return false; //If the given object is null return false.
		if (!(obj instanceof Person))
			return false; //If the given object is not of type Person return false.
		Person other = (Person) obj; //After  checking that the given object is of type Person, cast it to be of type Person.
		if (age != other.age)
			return false; //If the age attribute of the given object is not equal to this age attribute return false.  
		if (name == null) {
			if (other.name != null)
				return false; //If not both of the name attributes are null return false.
		} else if (!name.equals(other.name))
			return false; //If the name attribute of the given object is not equal to this name attribute return false.
		return true; //All the attributes of the given object are equal to the attributes of this object and thus the objects are equal. 
	}

	//Returns the attributes in a form of a String.
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
