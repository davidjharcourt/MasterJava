package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		
		/* creating a variable of type integer array
		 * initializing an array with 100 slots for 100 elements
		 */
		int [] values = new int[100];
		values[0] = 1000;
		values[99] = 93432;
		
		System.out.println(values[99]);
		
		String [] words = new String[] {"My","Name","is"};
		
		System.out.println(words[2]);
		

	}

}
