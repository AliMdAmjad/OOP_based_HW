package oopExam;

public class ConfiguredIphone6 extends Iphone6 {

	@Override
	public int materials(int ramPrice, int cameraPrice) {
		int total1 = ramPrice + cameraPrice + 10;
		System.out.println("Total price of ram and camera is " + total1);
		return total1;
	}

	@Override
	public int materials(int ramPrice, int cameraPrice, String processorPrice) {
		int total2 = ramPrice * 2 + cameraPrice + Integer.parseInt(processorPrice);
		System.out.println("Total price of ram camera and processor is " + total2);
		return total2;
	}

	@Override
	public void materials() {
		System.out.println("This is a void type method from Iphone6 Class");

	}

	@Override
	public void materials(int ramPrice, String processorPrice, int cameraPrice) {
		int total3 = ramPrice + Integer.parseInt(processorPrice) + 20;
		System.out.println("Total price of ram, processor and camera is " + total3);
	}

	/*The final and static method from a parent class cannot be overridden by a child class.
	  That is why, they are commented out below.
	  
	 * @Override
	public final int materials(int a, int b, int c) {
		int total4 = a + b + c;
		return total4;
	}
	
	@Override
	public static int materials(int a, int b, int c, int d) {
		int total5 = a + b + c + d;
		return total5;
	}*/

}
