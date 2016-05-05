package methodOverloadOverrideExamples;

public class MethodOverloadExample {

	//This sum method receives 2 int parameters. 
	public int sum(int a, int b) {
		return a + b;
	}
	//This sum method receives 3 int parameters.
	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		MethodOverloadExample d = new MethodOverloadExample();
		System.out.println(d.sum(5, 8)); //Invoking the first sum method.
		System.out.println(d.sum(5, 8, 3)); //Invoking the second sum method. 
	}

}
