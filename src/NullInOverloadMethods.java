/*
 * What happens when you pass a null to a overload method
 */

public class NullInOverloadMethods {
	
	
	public void method(Integer i) {		
		System.out.println("method(Integer) " + i);
	}
		
	public void method(String s) {
		System.out.println("method(String) " + s);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullInOverloadMethods test = new NullInOverloadMethods();
		
		
		//Error: The method method(Integer) is ambiguous for the type NullInOverloadMethods
		//This line below will give a compile time error
//		test.method(null);
		
		//If we know the type of the null value, then it's okay
		Integer i = null;
		test.method(i);
		String s = null;
		test.method(s);
	}

	
}
