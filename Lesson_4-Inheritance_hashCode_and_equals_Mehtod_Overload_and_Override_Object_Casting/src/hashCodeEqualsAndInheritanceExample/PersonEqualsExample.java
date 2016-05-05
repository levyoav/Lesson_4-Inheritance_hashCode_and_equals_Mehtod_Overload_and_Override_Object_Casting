package hashCodeEqualsAndInheritanceExample;


public class PersonEqualsExample {

	public static void main(String[] args) {
		//p1 and p2 are both Person type references to different but equal Person objects. 
		Person p1 = new Person("aaa", 15);
		Person p2 = new Person("aaa", 15);
		
		//The Person equals() method is implemented so that it checks if the name and age attributes of 2 Person
		//objects are equal. Will return true.
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2); //Return false since p1 and p2 refer to different objects.
		
		Person p3 = new Person("aaa");
		System.out.println(p1.equals(p3)); //Will return false because the AGE attribute of p1 is different form p3's.
		
		Person p4 = new Person(15);
		System.out.println(p1.equals(p4)); //Will return false because the NAME attribute of p1 is different form p4's.

		//When assigning the reference to an object in a println() method, the object's toString() method is invoked automatically.
		System.out.println(p1);
		System.out.println(p1.toString()); //Gives the same result as above.
		System.out.println(p3);
		System.out.println(p4);
	}
}
