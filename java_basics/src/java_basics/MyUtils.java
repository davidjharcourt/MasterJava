package java_basics;

public class MyUtils {
	
	public static void printSomeJunk(String argument) {
		System.out.println("Some bla bla bla " + argument);
	}
	
	public static int printSomeJunk(int argument) {
		return argument;
	}
	
	public static void sum2Numbers(int firstArg, int secondArg) {
		System.out.println(firstArg + secondArg);
	}
	
	public static int add10(int someArgument) {
		int result = someArgument + 10;
		return result;
		
	}

}
