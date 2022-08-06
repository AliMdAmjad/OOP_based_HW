package oopExam;

public class Iphone6 extends Iphone5 {

	public void compass() {
		System.out.println("Does iPhone compass show right directions?");
	}
	/*
	  Inheritance, one of the OOP features, can be used to relate Iphone1 toIphone6. 
	  It is a mechanism where child class inherits the properties and methods of parent class.
	 */

	/*
	 * Method Overloading:
	        Multiple methods with same names, different parameters/signatures, and different combination of parameters.
	        Happens in compile time.
	        Also called early binding, static binding, compile time polymorphism, static polymorphism.
	       
	 *  Method Overriding:
	        Multiple methods with same names and same parameters/signatures as parent class 
	        with different syntax or logic.
	        Happens in run time.
	        Also called late binding, dynamic binding, run time polymorphism, dynamic polymorphism.
	 */
	
	public int materials(int ramPrice, int cameraPrice) {
		int total1 = ramPrice + cameraPrice;
		System.out.println("Total price of ram and camera is " + total1);
		return total1;

	}

	public int materials(int ramPrice, int cameraPrice, String processorPrice) {
		int total2 = ramPrice + cameraPrice + Integer.parseInt(processorPrice);
		System.out.println("Total price of ram camera and processor is " + total2);
		return total2;
	}

	public void materials() {
		System.out.println("This is a void type method from Iphone6 Class");

	}

	public void materials(int ramPrice, String processorPrice, int cameraPrice) {
		int total3 = ramPrice + Integer.parseInt(processorPrice);
		System.out.println("Total price of ram, processor and camera is " + total3);
	}

	public final int materials(int a, int b, int c) {
		int total4 = a + b + c;
		System.out.println("Total4 from Iphone6 " + total4);
		return total4;
	}

	public static int materials(int a, int b, int c, int d) {
		int total5 = a + b + c + d;
		System.out.println("Total5 from Iphone6 " + total5);
		return total5;
	}
}
