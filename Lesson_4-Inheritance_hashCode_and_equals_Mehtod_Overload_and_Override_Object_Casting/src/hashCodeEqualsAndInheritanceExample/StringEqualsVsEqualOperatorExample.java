package hashCodeEqualsAndInheritanceExample;

public class StringEqualsVsEqualOperatorExample {

	public static void main(String[] args) {

		//str1 and str1 are references to 2 different but equal String type objects.
		String str1 = new String("AAA");
		System.out.println(str1);
		String str2 = new String("AAA");
		System.out.println(str2);

		//The expression will return false because the '==' operator only works on primitives. Not objects. The '=='
		//operator determines if 2 REFERENCES are identical to each other (meaning, refer to the same object). Since str1 and
		//str2 are references to different (not identical, although equal) objects, the expression is false.
		System.out.println(str1 == str2);
		
		//The equals() method determines if 2 objects are equal by their content (state-attributes), but not necessarily
		//identical (meaning, have the same reference). So this expression will return true.
		System.out.println(str1.equals(str2));
		
		String a = "AAA";
		String b = "AAA";
		
		//The expression: a == b will return true. This is due to the STRING POOL. The String pool I used for saving memory 
		//if 2 different variables refer to an identical string.
		System.out.println(a==b);
	}
}
