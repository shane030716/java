
/*
 * The general rule is that 
 * if there is a return statement in try or catch block
 * the finally block will be executed before the result is returned
 */
public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//uncomment them to try to examples
//		example1();
//		example2();
		example3();
//		example4(); 
//		example5();
//		example6();
	}
	
	/*
	 * Example1
	 * The finally block will still be executed if there is a return statement in the try block
	 */
	public static void example1() {
		int result = example1Helper();
		System.out.println("Result of example 1 is " + result);
	}
	
	private static int example1Helper() {
		try {
			System.out.println("Inside try block");
			return 1;
		} finally {
			System.out.println("Finally block still runs if there is a return in the try block");
		}
	}
	
	/*
	 * Example2
	 * The finally block will still be executed if we reach the catch block and there is a return statement inside
	 */
	public static void example2() {
		int result = example2Helper();
		System.out.println("Result of example 2 is " + result);
	}
	
	private static int example2Helper() {
		try {
			System.out.println("Inside try block");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Inside catch block");
			return 2;
		} finally {
			System.out.println("Finally block still runs if there is a return in the try block");
		}
	}
	
	/*
	 * Example3
	 * The example shows that the code in the return statement will be executed (however, not returned) first before the code in the 'finally' block.
	 * And then the program will return the result
	 */
	public static void example3() {
		int result = example3Helper();
		System.out.println("Result of example 3 is " + result);
	}
	
	private static int example3Helper() {
		try {
			System.out.println("Inside try block");
			return example3Result();
		} finally {
			System.out.println("Finally block still runs if there is a return in the try block");
		}
	}
	
	private static int example3Result() {
		System.out.println("The code inside the return statement");
		return 3;
	}
	
	/*
	 * Example 4
	 * Throwing an unchecked exception in the catch block
	 * 'finally' block will still be run before the program crashes
	 */
	public static void example4() {
		try {
			System.out.println("Inside try block. Throwing an exception");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Inside catch block. Throwing an exception again, but an unchecked exception");
			throw new NullPointerException();
		} finally {
			System.out.println("Finally block still runs if we throw an unchecked exception in the catch block");
		}
	}
	
	/*
	 * Example 5
	 * Similar to example 3
	 * the subclass unchecked exception will be created first before the code in the 'finally' block is run
	 * And then the program will throw the subclass exception and crashes
	 */
	public static void example5() {
		try {
			System.out.println("Inside try block. Throwing an exception");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Inside catch block. Throwing an exception again, but an unchecked exception");
			throw new MyNullPointerException();
		} finally {
			System.out.println("Finally block still runs if we throw an unchecked exception in the catch block");
		}
	}
	
	/*
	 * Subclass of an unchecked exception
	 */
	private static class MyNullPointerException extends NullPointerException {
		private static final long serialVersionUID = 1L;

		public MyNullPointerException() {
			super();
			System.out.println("Subclass of an unchecked exception");
		}
	}
	
	
	
	/*
	 * Example 6:
	 * If there is a return statement in the finally block, 
	 * it will override the return or throw statements in the try or catch block.
	 * However, this will get a warning in compile time and this is generally not a good idea to do so.
	 */
	public static void example6() {
		int result = example6Helper();
		System.out.println("Result of example 6 is " + result);
		//This will return 40
	}
	
	private static int example6Helper() {
		try {
			System.out.println("Inside try block");
			return 6;
			//Or throw an exception
			//throw new Exception();
			
		} finally {
			//Compile Warning: 'finally block does not complete normally'
			System.out.println("Finally block still runs if there is a return in the try block");
			return 60;
		}
		
	}
	
}
