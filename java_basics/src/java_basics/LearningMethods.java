package java_basics;

import someOtherPackage.ExampleClass;

public class LearningMethods {

	public static void main(String[] args) {
		
//		System.out.println("gibberish");
//		MyUtils.printSomeJunk("This is some data");
		int myvar2 = MyUtils.printSomeJunk(38);
//		MyUtils.sum2Numbers(10, 23);
		int myvar = MyUtils.add10(99)+1000;
		System.out.println(myvar);
		System.out.println(myvar2);
		int myvar3 = ExampleClass.doSomething();
		System.out.println(myvar3);

	}
	

}
