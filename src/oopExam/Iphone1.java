package oopExam;

/*
 *Class: 
           Regular Class is a blueprint of object which is created inside a package. Its name starts with upper case letter 
           and then follows either camel case or snake case feature. 
  
 * Things it can and cannot contain:
           A regular Class can contain variables, constructor (default and parameterized), 
           and only implemented methods (non-parameterized and parameterized). It cannot contain abstract methods
           and the implemented default method that is allowed in Interface.  
                       
           The variables inside a regular Class can be declared and initialized. 
           E.g.: public int age; -----> declared variable
                   public static int age =1859; ----> initialized variable
           
 * Things it can and cannot inherit:
           A regular Class can inherit only one regular Class or only one Abstract Class by 'extends' keyword 
           and more than one Interface by 'implements' keyword. it is called concrete class 
           when it extends one regular Class or Abstract Class and implements multiple interfaces.
           When a regular Class inherits an Abstract Class and Interface, it can override the abstract methods from 
           inherited Abstract Class and Interface. And @Override annotation is suggested in regular Class.
 
 * Things it can and cannot do:
           Regular Class can be instantiated by itself means it can create object without the help of
           Abstract Class or Interface. It can directly call static method from Abstract Class that it extends, 
           but cannot call static method from Interface that it implements.
 */

public class Iphone1 extends AppleWatch implements Phone {

	private int price;
	private String info;
	private char user;
	private boolean madeInUSA;

	public String name;

	public Iphone1() {
		System.out.println("This a default constructor from Iphone1 Class\n");
	}

	public Iphone1(int price, String info, char user, boolean madeInUSA) {
		System.out.println("This a parameterized constructor from Iphone1 Class\n");
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUSA = madeInUSA;
	}

	public void regularClassInfo() {
		System.out.println("This method is from the regular Class Iphone1.\n"
				+"-------------------------------------\n"
				+ "A regular Class and an Abstract Class can inherit only one regular Class\n"
				+ "or only one Abstract Class by 'extends' keyword\n"
				+ "and more than one Interface by 'implements' keyword.\n"
				+ "An Interface cannot inherit a regular Class or an Abstract Class by 'extends' or 'implements' keywords.\n"
				+ "However, it can inherit more than one Interface by 'extends' keywords.\n"
				+ "When a Class inherits an Abstract Class and Interface,\n"
				+ "it converts the abstract methods from that Abstract Class and Interface into implemented methods.\n"
				+ "A regular Class can be instantiated by itself, but an Abstract Class and an Interface cannot be\n"
				+ "instantiated by itself.\n");
	}

	public static void youTube() {
		System.out.println("YouTube is one of the best ways to communicate with a wide audience\n");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	@Override
	public void pagerInfo() {

	}

	@Override
	public void wakitokiInfo() {

	}

	@Override
	public void interfaceInfo() {

	}

	@Override
	public void call() {

	}

	@Override
	public void message() {

	}

	@Override
	public void camera() {

	}

	@Override
	public void appleWatchInfo() {

	}

	@Override
	public void watchInfo() {

	}

	@Override
	public void digitalWatchInfo() {

	}

}
