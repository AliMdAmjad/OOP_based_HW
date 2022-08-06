package oopExam;

/*
 * Abstract Class: 
          Abstract Class is a superclass which is created inside a package. Its name starts with upper case letter 
          and then follows either camel case or snake case feature. 
  
 * Things it can and cannot contain:
         Abstract Class can contain variables, constructor (default and parameterized), 
         and both abstract and non-abstract methods (parameterized and non-parameterized). 
         It cannot contain the implemented default method that is allowed only in Interface.  
                       
         The variables inside Abstract Class can be declared and initialized. 
         E.g.: public int age; -----> declared variable
                 public static int age =1859; ----> initialized variable
           
 * Things it can and cannot inherit:
         Abstract Class can inherit only one regular Class or only one Abstract Class by 'extends' keyword 
         and more than one Interface by 'implements' keyword. 
  
 * Things it can and cannot do:
         Abstract Class cannot be instantiated by itself means it can create object without the help of
         a concrete Class that inherits the Abstract Class or by anonymous inner class.
*/

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {

	public String name;

	public AppleWatch() {

	}

	public AppleWatch(String name) {
		this.name = name;

	}

	public void abstractClassInfo() {
		System.out.println("This is a non-abstract method from AppleWatch Abstract Class.\n"
				+"-----------------------------------------------\n"
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

	public abstract void appleWatchInfo();

}
